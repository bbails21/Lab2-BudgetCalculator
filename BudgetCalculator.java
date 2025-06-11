public class BudgetCalculator {
    public static void main(String[] args) {
        // Step 2: Define Constants
        final double SALARY = 3000.0;
        final double SAVINGS_PERCENT = 0.20;
        final double RENT_PERCENT = 0.30;
        final double GROCERIES_PERCENT = 0.15;
        final double ENTERTAINMENT_PERCENT = 0.10;

        // Step 3: Declare Variables
        double savedAmount;
        double rentAmount;
        double groceriesAmount;
        double entertainmentAmount;
        double totalExpenses;
        double remainingBalance;

        // Step 4: Perform Calculations
        savedAmount = SALARY * SAVINGS_PERCENT;
        rentAmount = SALARY * RENT_PERCENT;
        groceriesAmount = SALARY * GROCERIES_PERCENT;
        entertainmentAmount = SALARY * ENTERTAINMENT_PERCENT;

        totalExpenses = savedAmount + rentAmount + groceriesAmount + entertainmentAmount;
        remainingBalance = SALARY - totalExpenses;

        // Step 5: Display Results
        System.out.println("Monthly Budget Breakdown:");
        System.out.println("Salary: $" + SALARY);
        System.out.println("Savings: $" + savedAmount);
        System.out.println("Rent: $" + rentAmount);
        System.out.println("Groceries: $" + groceriesAmount);
        System.out.println("Entertainment: $" + entertainmentAmount);
        System.out.println("Total Expenses: $" + totalExpenses);
        System.out.println("Remaining Balance: $" + remainingBalance);
    }
}