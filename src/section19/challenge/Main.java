package section19.challenge;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {

        String challenge1 = "I want a bike";
        String challenge1RegExp = ".{13}";
        System.out.println(challenge1.matches(challenge1RegExp));
        System.out.println(challenge1.matches("I want a bike"));

        String challenge2 = "I want a ball";
        String regExp2 = "I want a b(ike|all)";
        System.out.println(challenge1.matches(regExp2));
        System.out.println(challenge2.matches(regExp2));

        String regExp3 = "I want a \\w+.";
        Pattern challenge3Pattern = Pattern.compile(regExp3);
        Matcher challenge3Matcher = challenge3Pattern.matcher(challenge1);
        System.out.println("challenge 3 = "+challenge3Matcher.find());

        String challenge4 = "Replace all blanks with underscore";
        System.out.println(challenge4.replaceAll(" ", "_"));
        System.out.println(challenge4.replaceAll("\\s", "_"));

        String challenge5 = "aaabccccccccdddefffg";
        System.out.println(challenge5.matches("[abcdefg]+"));
        System.out.println(challenge5.matches("[a-g]+"));

        String challenge6 = "aaabccccccccdddefffg";
        System.out.println(challenge6.matches("^a{3}bc{8}d{3}ef{3}g$"));
        System.out.println(challenge6.replaceAll("^a{3}bc{8}d{3}ef{3}g$","REPLACED"));
        System.out.println(challenge6.matches("(a){3}(b){1}(c){8}(d){3}(e){1}(f){3}(g){1}"));

        String challenge7 = "abcd.22";
        System.out.println(challenge7.matches("^\\w+\\.\\d+$"));

    }

}
