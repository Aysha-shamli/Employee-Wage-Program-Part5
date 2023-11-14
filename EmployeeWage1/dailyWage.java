package EmployyeWage;
public class dailyWage {
    public static int calculateDailyWage(int wagePerHour, int hoursWorked) {

        int dailyWage = wagePerHour * hoursWorked;

        System.out.println("Daily Wage is: " + dailyWage);

        return dailyWage;
    }
}
