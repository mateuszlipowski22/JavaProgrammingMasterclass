package section18.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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

    }

}
