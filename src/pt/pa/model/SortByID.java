package pt.pa.model;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortByID implements GradeSorting, Comparator<StudentGrade> {

    public int compare(StudentGrade sg, StudentGrade sg2) {
        return sg.getId().compareTo(sg2.getId());
    }

    @Override
    public void sort(List<StudentGrade> list) {
        Collections.sort(list, new SortByID());
    }
}
