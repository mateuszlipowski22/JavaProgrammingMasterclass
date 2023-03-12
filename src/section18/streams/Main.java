package section18.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        List<String> someBingoNumbers = Arrays.asList(
                "N40", "N36", "B12", "B6", "G53", "G49", "G60", "G50", "I26", "I17", "I29", "O71", "g64"
        );

        List<String> gNumbers = new ArrayList<>();

//        someBingoNumbers.forEach(number->{
//            if(number.toUpperCase().startsWith("G")){
//                gNumbers.add(number);
////                System.out.println(number);
//            }
//        });
//
//        gNumbers.sort((s1,s2)->s1.compareTo(s2));
//        gNumbers.forEach(s-> System.out.println(s));


//        someBingoNumbers
//                .stream()
//                .map(String::toUpperCase)
//                .filter(s->s.startsWith("G"))
//                .sorted()
//                .forEach(System.out::println);


        someBingoNumbers
                .stream()
                .map(s->s.toUpperCase())
                .filter(s->s.startsWith("G"))
                .sorted()
                .forEach(s-> System.out.println(s));

        Stream<String> ioNumberStream = Stream.of("I26", "I17", "I29", "O07");
        Stream<String> inNumberStream = Stream.of("N26", "N17", "N29", "O07","I26", "I17", "I29");
        Stream<String> concatStream = Stream.concat(ioNumberStream,inNumberStream);
        System.out.println("----------------------");
        System.out.println(concatStream
                .distinct()
                .peek(System.out::println)
                .count());




//        Random random = new Random();
//        Map<Integer,Integer> result = new HashMap<>();
//
//        int iteration = 1000;
//        int number;
//        for (int i=0; i<iteration; i++){
//            number = random.nextInt(10)+1;
//            if(!result.containsKey(number)){
//                result.put(number, 1);
//            }else {
//                result.put(number,result.get(number)+1);
//            }
//        }
//
//        for (Map.Entry<Integer, Integer> entry : result.entrySet()) {
//            System.out.println(entry.getKey() + ":" + entry.getValue());
//        }

        Employee john = new Employee("John Thomson", 30);
        Employee tim = new Employee("Tim Novak", 21);
        Employee jack = new Employee("Jack Hammer", 40);
        Employee snow = new Employee("Snow White", 33);
        Employee red = new Employee("Red Pill", 40);
        Employee charming = new Employee("Prince Charming", 33);

        Department hr = new Department("HR");
        hr.addEmployee(jack);
        hr.addEmployee(john);
        hr.addEmployee(tim);
        Department accounting = new Department("Accounting");
        accounting.addEmployee(snow);
        accounting.addEmployee(red);
        accounting.addEmployee(charming);

        List<Department> departments = new ArrayList<>();
        departments.add(hr);
        departments.add(accounting);

        departments.stream()
                .flatMap(department -> department.getEmployees().stream())
                .forEach(System.out::println);

//        List<String> sortedGNumbers = someBingoNumbers
//                .stream()
//                .map(String::toUpperCase)
//                .filter(s->s.startsWith("G"))
//                .sorted()
//                .collect(Collectors.toList());

        List<String> sortedGNumbers = someBingoNumbers
                .stream()
                .map(String::toUpperCase)
                .filter(s->s.startsWith("G"))
                .sorted()
                .collect(ArrayList::new, ArrayList::add, ArrayList::addAll);

        for (String s:sortedGNumbers){
            System.out.println(s);
        }

        Map<Integer, List<Employee>> gropuByAge = departments
                .stream()
                .flatMap(department -> department.getEmployees().stream())
                .collect(Collectors.groupingBy(employee -> employee.getAge()));


        for (Map.Entry<Integer, List<Employee>> list : gropuByAge.entrySet()) {
            System.out.println("Age : "+list.getKey());
            for (Employee employee : list.getValue()) {
                System.out.println(employee.getName());
            }
            System.out.println("-----------");
        }

        departments
                .stream()
                .flatMap(department -> department.getEmployees().stream())
                .reduce((e1,e2)->e1.getAge()< e2.getAge() ? e1 : e2)
                .ifPresent(System.out::println);

        Stream.of("ABC","AC","BAA","CCCC","XY","ST")
                .filter(s -> {
                    System.out.println(s);
                    return s.length()==3;
                }).count();
    }

}
