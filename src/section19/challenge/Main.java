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

        String challenge8 = "abcd.22uvqz.7tzik.999";
        String regExp8 ="(\\w+)\\.(\\d+)";
        Pattern challenge8Pattern = Pattern.compile(regExp8);
        Matcher challenge8Matcher = challenge8Pattern.matcher(challenge8);

        while(challenge8Matcher.find()){
            System.out.println("Occurrence "+challenge8Matcher.group(2));
        }

        String challenge9 = "abcd.22\tuvqz.7\ttzik.999\n";
        String regExp9 ="(\\w+)\\.(\\d+)\\s";
        Pattern challenge9Pattern = Pattern.compile(regExp9);
        Matcher challenge9Matcher = challenge9Pattern.matcher(challenge9);

        while(challenge9Matcher.find()){
            System.out.println("Occurrence "+challenge9Matcher.group(2));
        }

        String challenge10 = "abcd.22\tuvqz.7\ttzik.999\n";
        String regExp10 ="(\\w+)\\.(\\d+)\\s";
        Pattern challenge10Pattern = Pattern.compile(regExp10);
        Matcher challenge10Matcher = challenge10Pattern.matcher(challenge10);

        int counter=0;
        while(challenge10Matcher.find()){
            counter++;
            System.out.println("Occurrence : "+counter + " : " +challenge10Matcher.start(2)+" : "+(challenge10Matcher.end(2)-1));
        }

        String challenge11 = "{0,2},{0,5},{1,3},{2,4}";
        String regExp11 ="\\{(.+?)}";
        Pattern challenge11Pattern = Pattern.compile(regExp11);
        Matcher challenge11Matcher = challenge11Pattern.matcher(challenge11);

        while(challenge11Matcher.find()){
            System.out.println("Occurrence "+challenge11Matcher.group(1));;
        }

        String challenge11a = "{0,2},{0,5},{1,3},{2,4},{0,2},{x,y},{1,3},{2,4}";
        String regExp11a ="\\{(\\d+.\\d+)}";
        Pattern challenge11aPattern = Pattern.compile(regExp11a);
        Matcher challenge11aMatcher = challenge11aPattern.matcher(challenge11a);

        while(challenge11aMatcher.find()){
            System.out.println("Occurrence "+challenge11aMatcher.group(1));;
        }

        String challenge12 = "11111";
        String regExp12 = "^\\d{5}$";
        System.out.println(challenge12.matches(regExp12));

        String challenge13 = "11111-1111";
        String regExp13 = "^\\d{5}-\\d{4}$";
        System.out.println(challenge13.matches(regExp13));

        String challenge14a = "11111-1111";
        String challenge14b = "11111";

        String regExp14 = "(^\\d{5}(-\\d{4})?$)";
        System.out.println(challenge14a.matches(regExp14));
        System.out.println(challenge14b.matches(regExp14));

    }

}
