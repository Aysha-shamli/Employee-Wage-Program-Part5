package EmployyeWage;

public class multipleCompanies {
    public static int calculateMonthlyWage(int wagePerHour, int HoursWorked, int workingDaysPerMonth) {
        return wagePerHour * HoursWorked * workingDaysPerMonth;
    }

    public static void main(String[] args) {

        int totalWageCompany1 = calculateMonthlyWage(25, 8, 22);
        System.out.println("Company 1 Monthly Wage: " + totalWageCompany1);


        int totalWageCompany2 = calculateMonthlyWage(30, 6, 20);
        System.out.println("Company 2 Monthly Wage: " + totalWageCompany2);

        int totalWageCompany3 = calculateMonthlyWage(27, 8, 20);
        System.out.println("Company 3 Monthly Wage: " + totalWageCompany3);

        int totalWageCompany4 = calculateMonthlyWage(26, 4, 25);
        System.out.println("Company 4 Monthly Wage: " + totalWageCompany4);

    }
}
