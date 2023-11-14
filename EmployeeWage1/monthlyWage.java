package EmployyeWage;

import java.util.Scanner;

public class monthlyWage {
    public static int calculateMonthlyWage(int workingDaysPerMonth, int wage) {
        int MonthlyWage = wage * workingDaysPerMonth;
        System.out.println("Monthly Wage is: "+MonthlyWage);
        return MonthlyWage;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter 1 for Full-Time Employee or 2 for Part-Time Employee: ");
        int input = scanner.nextInt();
        int wage;

        switch (input) {
            case 1:
                wage = dailyWage.calculateDailyWage(20, 8);
                calculateMonthlyWage(20,  wage);
                break;
            case 2:
                wage = partTimeWage.calculatePartTimeWage(20, 4);
                calculateMonthlyWage(20,  wage);
                break;
            default:
                System.out.println("Invalid Input");
        }
    }
}

