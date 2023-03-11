package section18.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
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
    }

}
