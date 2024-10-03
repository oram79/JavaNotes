package Practice.Practice2;

public class Employee {
    private double salary;

    public Employee(String name, double salary) {
        this.salary = salary;
    }

    public double getAnnualSalary() {
        return salary * 12;
    }

    public void raiseSalary(double percentage) {
        salary += salary * (percentage / 100);
    }

    public double getSalary() {
        return salary;
    }
}

