package section14.lambda_mini_challenge;

import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class Main {

    public static void main(String[] args) {


        Consumer<String> printTheParts = sentence -> {
            String[] parts = sentence.split("");
            Arrays.asList(parts).forEach(part-> System.out.println(part));
        };

        Consumer<String> printTheParts2 = sentence -> {
            Arrays.asList(sentence.split("")).forEach(part-> System.out.println(part));
        };


        Function<String, String> everySecondChar = source ->{
            StringBuilder sb = new StringBuilder();
            for(int i=0; i<source.length();i++){
                if(i%2==1){
                    sb.append(source.charAt(i));
                }
            }
            return sb.toString();
        };

        System.out.println(everySecondChar.apply("1234567890"));

        System.out.println("everySecondCharacter(everySecondChar, \"1234567890\") = " + everySecondCharacter(everySecondChar, "1234567890"));

        Supplier<String> iLoveJava = ()->"I love java";

        String supplierResult = iLoveJava.get();
        System.out.println("supplierResult = " + supplierResult);

    }
    public static String everySecondCharacter(Function<String,String> everySecondChar, String source){
        return everySecondChar.apply(source);
    }
}
