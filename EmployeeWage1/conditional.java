package EmployyeWage;

public class conditional {
    static int wagePerHour = 20;
    static int fullTimeHours = 8;
    static int partTimeHours = 4;
    int totalWage;
    int totalHoursWorked;
    int totalDaysWorked;

    public conditional() {
        this.totalWage = 0;
        this.totalHoursWorked = 0;
        this.totalDaysWorked = 0;
    }

    public void workFullTime() {
        if (totalHoursWorked + fullTimeHours <= 100 && totalDaysWorked < 20) {
            totalHoursWorked += fullTimeHours;
            totalDaysWorked++;
            totalWage += wagePerHour * fullTimeHours;
        }
    }
    public void workPartTime() {
        if (totalHoursWorked + partTimeHours <= 100 && totalDaysWorked < 20) {
            totalHoursWorked += partTimeHours;
            totalDaysWorked++;
            totalWage += wagePerHour * partTimeHours;
        }
    }

    public static void main(String[] args) {
        conditional employee = new conditional();

        while (employee.totalHoursWorked < 100 && employee.totalDaysWorked < 20) {
            int input = (int) (Math.random() * 2) + 1;

            switch (input) {
                case 1:
                    employee.workFullTime();
                    break;
                case 2:
                    employee.workPartTime();
                    break;
            }
        }

        System.out.println("Total Working Days: " + employee.totalDaysWorked);
        System.out.println("Total Working Hours: " + employee.totalHoursWorked);
        System.out.println("Total Monthly Wage: " + employee.totalWage);
    }
}
