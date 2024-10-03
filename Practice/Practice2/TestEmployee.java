package Practice.Practice2;

public class TestEmployee {
    public static void main(String[] args) {
        Employee john = new Employee("John", 4500);
        Employee james = new Employee("James", 5000);

        System.out.println("John's Annual Salary: $" + john.getAnnualSalary());
        System.out.println("James's Annual Salary: $" + james.getAnnualSalary());

        john.raiseSalary(20);
        james.raiseSalary(20);

        System.out.println("John's New Salary: $" + john.getSalary());
        System.out.println("James's New Salary: $" + james.getSalary());
    }
}

