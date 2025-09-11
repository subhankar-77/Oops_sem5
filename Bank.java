import java.util.*;

class Bank {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Initial Balance: ");
        double balance = sc.nextDouble();
        System.out.print("Enter Annual Interest Rate: ");
        double rate = sc.nextDouble();
        System.out.print("Enter Number of Years: ");
        int years = sc.nextInt();

        System.out.printf("%-6s %-20s %-15s %-20s%n", "Year", "Old Balance", "Interest", "New Balance");

        for (int i = 1; i <= years; i++) {
            double interest = balance * (rate / 100);
            double newbalance = balance + interest;
            System.out.printf("%-6d %-20.2f %-15.2f %-20.2f%n", i, balance, interest, newbalance);
            balance = newbalance;
        }
        sc.close();
    }
}
