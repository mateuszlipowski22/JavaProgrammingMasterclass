package section7.inheritanceChallenge;

import java.time.LocalDate;

public class SalariedEmployee extends Employee{

    private double annualSalary;
    private boolean isRetired;

    public SalariedEmployee(String name, String birthDate, double annualSalary) {
        super(name, birthDate);
        this.annualSalary = annualSalary;
        isRetired=false;
    }

    @Override
    public double collectPay() {
        double payCheck = annualSalary/12;
        double adjustedPaycheck = (isRetired) ? 0.9*payCheck : payCheck;

        return (int) adjustedPaycheck;
    }

    public void retire(){
        isRetired=true;
        super.terminate(LocalDate.now().toString());
    }

}
