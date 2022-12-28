package section7.inheritanceChallenge;

public class Main {

    public static void main(String[] args) {

        Employee tim = new Employee("Tim", "11/11/1985");
        System.out.println(tim);
        System.out.println("tim.getAge() = " + tim.getAge());
        System.out.println("tim.collectPay() = " + tim.collectPay());

        SalariedEmployee jim = new SalariedEmployee("Jim", "11/11/1975", 35000);
        System.out.println(jim);
        System.out.println("jim.getAge() = " + jim.getAge());
        System.out.println("jim.collectPay() = " + jim.collectPay());

        jim.retire();
        System.out.println("jim.collectPay() = " + jim.collectPay());

        HourlyEmployee mary = new HourlyEmployee("Mary", "11/11/1975", 5000);
        System.out.println(mary);
        System.out.println("mary.collectPay() = " + mary.collectPay());
        System.out.println("mary.getDoublePay() = " + mary.getDoublePay());
    }

}
