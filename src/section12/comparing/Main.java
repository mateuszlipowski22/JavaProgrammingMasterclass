package section12.comparing;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Integer five = 5;
        Integer[] others = {0, 5, 10, -50, 50};

        for(Integer i : others){
            int val = five.compareTo(i);
            System.out.printf("%d %s %d: compareTo=%d%n", five, (val == 0 ? "==" : (val<0) ? "<" : ">"), i, val);
        }

        String banana = "banana";
        String[] fruit = {"apple", "banana", "pear", "BANANA"};

        for (String s : fruit){
            int val = banana.compareTo(s);
            System.out.printf("%s %s %s: compareTo=%d%n", banana, (val == 0 ? "==" : (val<0) ? "<" : ">"), s, val);

        }

        Arrays.sort(fruit);
        System.out.println(Arrays.toString(fruit));

        System.out.println("A:"+(int)'A'+" "+"a:"+(int)'a');
        System.out.println("B:"+(int)'B'+" "+"b:"+(int)'b');
        System.out.println("P:"+(int)'P'+" "+"p:"+(int)'p');


        Student time = new Student("time");
        Student[] students = new Student[]{
                new Student("zach"),
                new Student("maek"),
                new Student("time"),
                new Student("Ann")
        };

        Arrays.sort(students);
        System.out.println(Arrays.toString(students));

        System.out.println("result = "+ time.compareTo(new Student("Time")));

        Comparator<Student> gpaSorter = new StudentGPAComparator();
        Arrays.sort(students,gpaSorter.reversed());
        System.out.println(Arrays.toString(students));
    }
}

class StudentGPAComparator implements Comparator<Student>{
    @Override
    public int compare(Student o1, Student o2) {
        return (o1.gpa+o1.name).compareTo(o2.gpa+o2.name);
    }
}

class Student implements Comparable<Student>{
    private static int LAST_ID=1000;
    private static Random random=new Random();
    String name;
    private int id;
    protected double gpa;

    public Student(String name) {
        this.name = name;
        id=LAST_ID++;
        gpa=random.nextDouble();
    }

    @Override
    public String toString() {
        return "%d - %s (%.2f)".formatted(id, name, gpa);
    }

    @Override
    public int compareTo(Student student) {
//        return name.compareTo(student.name);
        return Integer.valueOf(id).compareTo(Integer.valueOf(student.id));
    }
}