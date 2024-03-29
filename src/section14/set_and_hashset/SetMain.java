package section14.set_and_hashset;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetMain {

    public static void main(String[] args) {
        Set<Integer> squares = new HashSet<>();
        Set<Integer> cubes = new HashSet<>();

        for (int i = 1; i <= 100 ; i++) {
            squares.add(i*i);
            cubes.add(i*i*i);
        }

        System.out.println("squares.size() = " + squares.size());
        System.out.println("cubes.size() = " + cubes.size());

        Set<Integer> union = new HashSet<>(squares);
        union.addAll(cubes);

        System.out.println("union.size() = " + union.size());

        Set<Integer> intersection = new HashSet<>(squares);
        intersection.retainAll(cubes);
        System.out.println("intersection.size() = " + intersection.size());
        for (Integer integer : intersection) {
            System.out.println(integer + " is the square of "+ Math.sqrt(integer) +" and the cube of " + Math.cbrt(integer) );
        }

        Set<String> words = new HashSet<>();
        String sentance = "one day in the year of the fox";
        String[] arrayWords = sentance.split(" ");
        words.addAll(Arrays.asList(arrayWords));

        for (String word : words) {
            System.out.println("word = " + word);
        }

        Set<String> nature = new HashSet<>();
        Set<String> divine = new HashSet<>();
        String[] natureWords = {"all", "nature", "is", "but", "art", "unknown", "to", "thee"};
        nature.addAll(Arrays.asList(natureWords));

        String[] divineWords = {"to", "err", "is", "is", "human", "to", "forgive", "divine"};
        divine.addAll(Arrays.asList(divineWords));

        System.out.println("nature - divine");
        Set<String> diff1 = new HashSet<>(nature);
        diff1.removeAll(divine);
        printSet(diff1);

        System.out.println("divine - nature");
        Set<String> diff2 = new HashSet<>(divine);
        diff2.removeAll(nature);
        printSet(diff2);


        Set<String> unionTest = new HashSet<>(nature);
        unionTest.addAll(divine);
        Set<String> intesectionTest = new HashSet<>(nature);
        intesectionTest.retainAll(divine);

        System.out.println("Symmetric differance");
        unionTest.removeAll(intesectionTest);
        printSet(unionTest);

        if(nature.containsAll(divine)){
            System.out.println("divine is a subset of nature");
        }

        if(nature.containsAll(intesectionTest)){
            System.out.println("intesectionTest is a subset of nature");
        }

        if(divine.containsAll(intesectionTest)){
            System.out.println("intesectionTest is a subset of divine");
        }

    }
    private static void printSet(Set<String> set){
        System.out.print("\t");
        for (String s : set) {
            System.out.print(s+" ") ;
        }
        System.out.println();
    }
}
