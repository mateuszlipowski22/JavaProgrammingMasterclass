package section12.student_challenge.model;

import section12.student_challenge.util.QueryItem;

import java.util.Random;

public class Student implements QueryItem, Comparable<Student> {

    private static int LAST_ID=10000;

    private int id;
    private String name;
    private String course;
    private int yearStarted;

    protected static Random random = new Random();

    private static String[] firstNames = {"Ann", "Bill", "Cathy", "John", "Tim"};

    private static String[] courses = {"C++", "Java", "Python"};

    public Student(){
        id=LAST_ID++;
        int lastNameIndex = random.nextInt(26)+65;
        name = firstNames[random.nextInt(5)]+" "+(char) lastNameIndex;
        course = courses[random.nextInt(3)];
        yearStarted = random.nextInt(5)+2018;
    }

    @Override
    public String toString() {
        return "%d %-15s %-15s %d".formatted(id, name, course, yearStarted);
    }

    public int getYearStarted() {
        return yearStarted;
    }

    @Override
    public boolean matchFieldValue(String fieldName, String value) {
        String fName = fieldName.toUpperCase();
        return switch (fName){
            case "NAME" -> name.equalsIgnoreCase(value);
            case "COURSE" -> course.equalsIgnoreCase(value);
            case "YEARSTARTED" -> yearStarted==(Integer.parseInt(value));
            default -> false;
        };
    }

    @Override
    public int compareTo(Student o) {
        return Integer.compare(id, o.id);
    }
}
