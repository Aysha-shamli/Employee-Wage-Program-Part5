package EmployyeWage;

public class partTimeWage {
    public static int calculatePartTimeWage(int wagePerHour, int hoursWorked) {

        int partTimeWage = wagePerHour * hoursWorked;

        System.out.println("Part Time Wage is: " + partTimeWage);

        return partTimeWage;
    }
}
