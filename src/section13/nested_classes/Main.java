package section13.nested_classes;

import section13.nested_classes.domain.Employee;
import section13.nested_classes.domain.StoreEmployee;

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


        System.out.println("Store Members");

        List<StoreEmployee> storeEmployees = new ArrayList<>(List.of(
                new StoreEmployee(10515, "Meg",2019, "Target"),
                new StoreEmployee(10015, "Joe",2021, "Walmart"),
                new StoreEmployee(10115, "Tom",2020, "Macys"),
                new StoreEmployee(10014, "Marty",2019, "Walmart"),
                new StoreEmployee(10224, "Bud",2016, "Target")));

//        var genericEmployee = new StoreEmployee();
//        var comparator = genericEmployee.new StoreComparator<>();
        var comparator = new StoreEmployee().new StoreComparator<>();
//        var comparator = new Employee.EmployeeComparator<>();
        storeEmployees.sort(comparator);

        storeEmployees.forEach(System.out::println);

        System.out.println("With pig letter names:");
        addPigLatinName(storeEmployees);

    }

    public static void addPigLatinName(List<? extends StoreEmployee> list){

        String lastName = "Piggy";

        class DecorateEmployee extends StoreEmployee implements Comparable<DecorateEmployee>{

            private String pigLatinName;
            private Employee originalInstance;

            public DecorateEmployee(String pigLatinName, Employee originalInstance) {
                this.pigLatinName = pigLatinName+" "+lastName;
                this.originalInstance = originalInstance;
            }

            @Override
            public String toString(){
                return originalInstance + " "+ pigLatinName;
            }

            @Override
            public int compareTo(DecorateEmployee o) {
                return pigLatinName.compareTo(o.pigLatinName);
            }
        }

        List<DecorateEmployee> newList = new ArrayList<>(list.size());

        for(var employee : list){
            String name = employee.getName();
            String pigLatin = name.substring(1)+name.charAt(0)+"ay";
            newList.add(new DecorateEmployee(pigLatin, employee));
        }

        newList.sort(null);
        for(var dEmployee : newList){
            System.out.println(dEmployee.originalInstance+" "+dEmployee.pigLatinName);
        }

    }
}
