package section13._final;

public class Main {

    public static void main(String[] args) {
        SomeClass one = new SomeClass("one");
        SomeClass two = new SomeClass("two");
        SomeClass three = new SomeClass("three");

        System.out.println("one.getInstanceNumber() = " + one.getInstanceNumber());
        System.out.println("two.getInstanceNumber() = " + two.getInstanceNumber());
        System.out.println("three.getInstanceNumber() = " + three.getInstanceNumber());

//        one.instanceNumber = 4;

        System.out.println("Math.PI = " + Math.PI);

//        Math math = new Math();

        int pw = 67;
        Password password = new Password(pw);
        password.storePassword();

        password.letMeIn(1);
        password.letMeIn(67);
    }
}
