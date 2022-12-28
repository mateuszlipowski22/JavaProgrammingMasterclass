package section7.inheritanceChallenge;

public class HourlyEmployee extends Employee{

    private double hourlyPayRate;

    public HourlyEmployee(String name, String birthDate, double hourlyPayRate) {
        super(name, birthDate);
        this.hourlyPayRate = hourlyPayRate;
    }

    @Override
    public double collectPay() {
        return hourlyPayRate*160;
    }

    public double getDoublePay(){
        return 2*collectPay();
    }

}
