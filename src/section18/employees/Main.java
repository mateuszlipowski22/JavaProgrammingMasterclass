package section18.employees;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.IntPredicate;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main {

    public static void main(String[] args) {

        Employee john = new Employee("John", 30);
        Employee tim = new Employee("Tim", 21);
        Employee jack = new Employee("Jack", 40);
        Employee snow = new Employee("Snow White", 33);
        Employee red = new Employee("Red", 40);
        Employee charming = new Employee("Prince Charming", 33);

        List<Employee> employees = new ArrayList<>();
        employees.add(jack);
        employees.add(john);
        employees.add(tim);
        employees.add(snow);
        employees.add(red);
        employees.add(charming);

//        System.out.println("Employees 30 and younger");
//        System.out.println("=================");
//        employees.forEach(employee -> {
//            if (employee.getAge() <= 30) {
//                System.out.println(employee.getName());
//            }
//        });

//        for (Employee employee : employees) {
//            if(employee.getAge()>30){
//                System.out.println(employee.getName());
//            }
//        }

        printEmployeeByAge(employees, "Employees over 30", employee -> employee.getAge()>30);
        printEmployeeByAge(employees, "Employees 30 and younger", employee -> employee.getAge()<=30);
        printEmployeeByAge(employees, "Employees younger than 25", new Predicate<Employee>() {
            @Override
            public boolean test(Employee employee) {
                return employee.getAge()<25;
            }
        });

        IntPredicate greaterThanFifteen = i -> i>15;
        IntPredicate lowerThanOneHundred = i -> i<100;

        System.out.println(greaterThanFifteen.test(10));
        int a = 20;
        System.out.println(greaterThanFifteen.test(a + 10));

        System.out.println(greaterThanFifteen.and(lowerThanOneHundred).test(a));
        System.out.println(greaterThanFifteen.and(lowerThanOneHundred).test(15));

        Random random = new Random();
        Supplier<Integer> randomSupplier = ()->random.nextInt(1000);
        for(int i=0;i<10;i++){
            System.out.println(randomSupplier.get());
        }

    }

    private static void printEmployeeByAge(List<Employee> employees,
                                           String ageText,
                                           Predicate<Employee> ageCondition){
        System.out.println(ageText);
        System.out.println("=================");
        for (Employee employee : employees) {
            if (ageCondition.test(employee)){
                System.out.println(employee.getName());
            }
        }
        System.out.println();
    }
}
