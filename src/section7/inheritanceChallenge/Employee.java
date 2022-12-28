package section7.inheritanceChallenge;

import java.time.LocalDate;

public class Employee extends Worker{

    private static long currentId=1;

    private long employeeId;
    private String hireDate;

    public Employee(String name, String birthDate) {
        super(name, birthDate);
        this.hireDate = LocalDate.now().toString();
        employeeId=currentId;
        Employee.currentId++;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", hireDate='" + hireDate + '\'' +
                "} " + super.toString();
    }
}
