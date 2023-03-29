package section13.nested_classes;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Employee> employees = new ArrayList<>(List.of(
                new Employee(10001, "Ralpf", 2015),
                new Employee(10003, "Carole", 2021),
                new Employee(10022, "Jane", 2014),
                new Employee(10123, "Laura", 2016),
                new Employee(14532, "Ace", 2023)
        ));

//        var comparator = new EmployeeComparator<Employee>();
//        employees.sort(comparator);

        employees.sort(new Employee.EmployeeComparator<Employee>("yearStarted").reversed());

        employees.forEach(System.out::println);


    }

}
