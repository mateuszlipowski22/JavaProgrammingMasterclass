package section13.local_anonymous_class;

import section13.local_anonymous_class.domain.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;


public class Main {

    public static void main(String[] args) {

        List<Employee> list = new ArrayList<>(List.of(
                new Employee( "Meg", "Smith", "2019"),
                new Employee("Joe","Hulk","2021"),
                new Employee("Tom","Kennedy","2020"),
                new Employee("Marty","Dylan", "2019"),
                new Employee("Bud","Bacon","2016")));

        printOrderedList(list, "name");
        printOrderedList(list, "2");
    }

    public static void printOrderedList(List<Employee> eList, String sortField){

        int currentYear = LocalDate.now().getYear();

        class MyEmployee{

            Employee containedEmployee;

            int yearsWorked;

            String fullName;

            public MyEmployee(Employee containedEmployee) {
                this.containedEmployee = containedEmployee;
                yearsWorked=currentYear-Integer.parseInt(containedEmployee.hireDate());
                fullName = String.join(" ", containedEmployee.firstName(), containedEmployee.lastName());
            }

            @Override
            public String toString() {
                return "%s has been an employee for %d years".formatted(fullName,yearsWorked);
            }
        }

        List<MyEmployee> list = new ArrayList<>();

        for (Employee employee : eList){
            list.add(new MyEmployee(employee));
        }

        var comparator = new Comparator<MyEmployee>(){
            @Override
            public int compare(MyEmployee o1, MyEmployee o2) {
                if (sortField.equalsIgnoreCase("name")){
                    return o1.fullName.compareTo(o2.fullName);
                }
                return o1.yearsWorked-o2.yearsWorked;
            }
        };

        list.sort(comparator);
        list.forEach(System.out::println);
    }
}
