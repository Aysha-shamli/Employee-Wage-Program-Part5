package EmployyeWage;
import java.util.Scanner;

public class switchCase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter 1 for Full-Time Employee or 2 for Part-Time Employee: ");
        int input = scanner.nextInt();

        switch (input) {
            case 1:
                dailyWage.calculateDailyWage(20, 8);
                break;
            case 2:
                partTimeWage.calculatePartTimeWage(20, 4);
                break;
            default:
                System.out.println("Invalid Input");
        }
    }
}
