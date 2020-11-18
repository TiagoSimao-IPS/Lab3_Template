package pt.pa.model;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortByName implements GradeSorting, Comparator<StudentGrade> {

    public int compare(StudentGrade sg, StudentGrade sg2) {
        return sg.getName().compareTo(sg2.getName());
    }

    @Override
    public void sort(List<StudentGrade> list) {
        Collections.sort(list, new SortByName());
    }
}
