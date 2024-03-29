package section12.generic_extras;

import section12.generic_extras.util.QueryItem;
import section12.generic_extras.util.QueryList;

import java.util.ArrayList;
import java.util.List;

record Employee(String name) implements QueryItem{
    @Override
    public boolean matchFieldValue(String fieldName, String value) {
        return false;
    }
}

public class Main {

    public static void main(String[] args) {


        int studentCount = 10;
        List<Student> students = new ArrayList<>();
        for (int i = 0; i < studentCount; i++) {
            students.add(new Student());
        }

        printStudents(students);

        List<Student> plaStudents = new ArrayList<>();
        for (int i = 0; i < studentCount; i++) {
            plaStudents.add(new PLAStudent());
        }

        printStudents(plaStudents);

        testList(new ArrayList<String>(List.of("Mati", "Seba")));
        testList(new ArrayList<Integer>(List.of(1,2,4,5,6)));

        var queryList = new QueryList<>(plaStudents);
        var matches = queryList.getMatches("course", "python");
        printMoreLists(matches);

        var students2021 = QueryList.getMatches(students, "yearstarted", "2021");
        printMoreLists(students2021);

//        QueryList<Employee> employeeList = new QueryList<>();

    }

    public static void printStudents(List<? extends Student> students) {
        students.forEach(student -> System.out.println(student.getYearStarted() + ": " + student));
    }

    public static <T extends Student> void printMoreLists(List<T> students) {
        students.forEach(student -> System.out.println(student.getYearStarted() + ": " + student));
    }

    public static void testList(List<?> list) {
        for (var element : list) {
            if (element instanceof String s) {
                System.out.println("String: " + s.toUpperCase());
            } else if (element instanceof Integer i) {
                System.out.println("Integer: " + i.floatValue());
            }
        }
    }

//    public static void testList(List<String> list){
//        for(var element : list){
//            System.out.println("String: "+element.toUpperCase());
//        }
//    }
//
//    public static void testList(List<Integer> list){
//        for(var element : list){
//            System.out.println("Integer: "+element.floatValue());
//        }
//    }
}
