package section12.student_challenge;


import section12.student_challenge.model.LPAStudentComparator;
import section12.student_challenge.model.PLAStudent;
import section12.student_challenge.model.Student;
import section12.student_challenge.util.QueryList;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        int studentCount = 25;
        QueryList<PLAStudent> students = new QueryList<>();
        for (int i = 0; i < studentCount; i++) {
            students.add(new PLAStudent());
        }

        printStudents(students);
        students.sort(Comparator.naturalOrder());

        QueryList<PLAStudent> matches = new QueryList<PLAStudent>(students)
                .getMatches("percentageComplete", "50")
                .getMatches("COurse", "Python");



        Collections.sort(matches);

        matches.sort(new LPAStudentComparator());
        printStudents(matches);
    }

    public static void printStudents(List<? extends Student> students) {
        students.forEach(student -> System.out.println(student.getYearStarted() + ": " + student));
    }
}
