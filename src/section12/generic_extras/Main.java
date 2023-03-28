package section12.generic_extras;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {


        int studentCount = 10;
        List<Student> students= new ArrayList<>();
        for (int i = 0; i < studentCount; i++) {
            students.add(new Student());
        }

        printStudents(students);

        List<Student> plaStudents= new ArrayList<>();
        for (int i = 0; i < studentCount; i++) {
            plaStudents.add(new PLAStudent());
        }

        printStudents(plaStudents);
    }

    public static void printStudents(List<Student> students){
        students.forEach(System.out::println);
    }
}
