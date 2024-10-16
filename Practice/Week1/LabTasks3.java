package Practice.Week1;

public class LabTasks3 {

    /// Question #3 ///
    
    public static void main(String[] args) {

        double initialInvestment = 1000.0;

        double profitRate = 0.05;

        int years = 10;

        double currentBalance = initialInvestment;

        for (int year = 1; year <= years; year++) {
        
            currentBalance = currentBalance * (1 + profitRate);
            
            System.out.printf("Year %d: $%.2f%n", year, currentBalance);
        }
    }
}
