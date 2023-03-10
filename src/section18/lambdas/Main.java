package section18.lambdas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {

//        new Thread(()-> {
//            System.out.println("Printing from the Runnable");
//            System.out.println("Line 2");
//            System.out.println("This is line number 3");
//
//        }).start();

        Employee john = new Employee("John", 30);
        Employee tim = new Employee("Tim", 21);
        Employee jack = new Employee("Jack", 40);
        Employee snow = new Employee("Snow White", 33);

        List<Employee> employees = new ArrayList<>();
        employees.add(jack);
        employees.add(john);
        employees.add(tim);
        employees.add(snow);

//        Collections.sort(employees, new Comparator<Employee>(){
//            @Override
//            public int compare(Employee employee1, Employee employee2) {
//                return employee1.getName().compareTo(employee2.getName());
//            }
//        });

        Collections.sort(employees, (e1, e2) -> e1.getName().compareTo(e2.getName()));

        for (Employee employee : employees) {
            System.out.println("employee.getName() = " + employee.getName());
        }

//        String sillyString = doStringStuff(new UpperConcat() {
//            @Override
//            public String upperConcat(String s1, String s2) {
//                return s1.toUpperCase()+s2.toUpperCase();
//            }
//        }, employees.get(0).getName(),employees.get(1).getName());
//        System.out.println("sillyString = " + sillyString);


        UpperConcat uc = (s1, s2) -> {
            String result = s1.toUpperCase() + s2.toUpperCase();
            return result;
        };
        String sillyString = doStringStuff(uc,
                employees.get(0).getName(),
                employees.get(1).getName());
        System.out.println("sillyString = " + sillyString);

        AnotherClass anotherClass = new AnotherClass();
        String s = anotherClass.doSomething();
        System.out.println("s = " + s);
    }

    public final static String doStringStuff(UpperConcat uc, String s1, String s2) {
        return uc.upperConcat(s1, s2);
    }
}

class Employee {
    private String name;
    private int age;

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

interface UpperConcat {
    String upperConcat(String s1, String s2);
}

class AnotherClass {
    public String doSomething() {

//        UpperConcat upperConcat = (s1,s2)->{
//            System.out.println("The lambda expression class is "+getClass().getSimpleName());
//            String result = s1.toUpperCase()+s2.toUpperCase();
//            return result;
//        };

        int i = 0;
        UpperConcat upperConcat = (s1,s2)->{
            System.out.println("Lambda class name is "+ getClass().getSimpleName());
            return s1.toUpperCase()+s2.toUpperCase();
        };

//        UpperConcat upperConcat = new UpperConcat() {
//            @Override
//            public String upperConcat(String s1, String s2) {
//                System.out.println("i within anonymous class= " + i);
//                return s1.toUpperCase() + s2.toUpperCase();
//            }
//        };

//            i++;
        System.out.println("i = " + i);
        System.out.println("Another class name is " + getClass().getSimpleName());
        return Main.doStringStuff(upperConcat, "String1", "String2");


//        System.out.println("Another class name is "+ getClass().getSimpleName());
//        return Main.doStringStuff(new UpperConcat() {
//            @Override
//            public String upperConcat(String s1, String s2) {
//                System.out.println("Anonymous class name is "+ getClass().getSimpleName());
//                return s1.toUpperCase()+s2.toUpperCase();
//            }
//        },"String1","String2");
    }
}