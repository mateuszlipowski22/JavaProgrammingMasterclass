package section18.challenge;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

//        Runnable runnable = new Runnable() {
//            @Override
//            public void run() {
//                String myString = "Let's split this up into an array";
//                String[] parts = myString.split(" ");
//                for (String part : parts) {
//                    System.out.println(part);
//                }
//            }
//        };
//
//        new Thread(() -> {
//            Arrays.stream("Let's split this up into an array".split(" "))
//                    .forEach(System.out::println);
//        }).start();
//
//        Runnable runnableLam = () -> {
//            String myString = "Let's split this up into an array";
//            String[] parts = myString.split(" ");
//            for (String part : parts) {
//                System.out.println(part);
//            }
//        };
//
////        Supplier<String> iLoveJava = () -> "I love java";
//        Supplier<String> iLoveJava = () ->{return "I love java";} ;
//
//        String supplierResult = iLoveJava.get();
//        System.out.println(supplierResult);
//
//        Function<String,String> lambdaFunction = source -> {
//            StringBuilder returnVal = new StringBuilder();
//            for (int i = 0; i < source.length(); i++) {
//                if (i % 2 == 1) {
//                    returnVal.append(source.charAt(i));
//                }
//            }
//            return returnVal.toString();
//        };
//
//        String result = lambdaFunction.apply("1234456sadasd");
//        System.out.println(result);
//
//        String result2 = runMethod(lambdaFunction, "dsadasdasdasdasd");
//        System.out.println(result2);

        List<String> topNames2015 = Arrays.asList(
                "Amelia",
                "Olivia",
                "emily",
                "Isla",
                "Ava",
                "oliver",
                "Jack",
                "Charlie",
                "harry",
                "Jacob"
        );

        topNames2015.stream()
                .map(s-> s.substring(0,1).toUpperCase()+s.substring(1))
                .sorted(String::compareTo)
                .forEach(System.out::println);


        List<String> firstUpperCaseList = new ArrayList<>();

//        topNames2015.stream()
//                .forEach(s -> firstUpperCaseList.add(s.substring(0,1).toUpperCase()+s.substring(1)));
//        firstUpperCaseList.sort((s1,s2)->s1.compareTo(s2));
//        firstUpperCaseList.forEach(System.out::println);

        topNames2015.stream()
                .forEach(s -> firstUpperCaseList.add(s.substring(0,1).toUpperCase()+s.substring(1)));
        firstUpperCaseList.sort(String::compareTo);
        firstUpperCaseList.forEach(System.out::println);


        System.out.println(topNames2015.stream()
                .map(s -> s.substring(0, 1).toUpperCase() + s.substring(1))
                .filter(s -> s.startsWith("A"))
                .count());

        System.out.println("---------------");
        topNames2015.stream()
                .map(s -> s.substring(0, 1).toUpperCase() + s.substring(1))
                .peek(System.out::println)
                .sorted(String::compareTo)
                .collect(Collectors.toList());


    }

    public static String everySecondChar(String source) {
        StringBuilder returnVal = new StringBuilder();
        for (int i = 0; i < source.length(); i++) {
            if (i % 2 == 1) {
                returnVal.append(source.charAt(i));
            }
        }
        return returnVal.toString();
    }

    public static String runMethod(Function<String,String> function, String input){
        return function.apply(input);
    }
}



