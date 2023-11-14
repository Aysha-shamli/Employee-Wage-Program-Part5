package EmployyeWage;
class EmpWageBuilder {
    private final String companyName;
    private final int hourlyWage;
    private final int hoursWorked;
    private final int workingDaysPerMonth;
    private int totalWage;

    public EmpWageBuilder(String companyName, int hourlyWage, int hoursWorked, int workingDaysPerMonth) {
        this.companyName = companyName;
        this.hourlyWage = hourlyWage;
        this.hoursWorked = hoursWorked;
        this.workingDaysPerMonth = workingDaysPerMonth;
        this.totalWage = 0;
    }

    public int calculateMonthlyWage() {
        totalWage = hourlyWage * hoursWorked * workingDaysPerMonth;
        return  totalWage;
    }

    public static void main(String[] args) {
        EmpWageBuilder company1 = new EmpWageBuilder("Company 1", 25, 8, 22);
        System.out.println(company1.companyName + " Monthly Wage: " + company1.calculateMonthlyWage());

        EmpWageBuilder company2 = new EmpWageBuilder("Company 2", 30, 6, 20);
        System.out.println(company2.companyName + " Monthly Wage: " + company2.calculateMonthlyWage());

        EmpWageBuilder company3 = new EmpWageBuilder("Company 3", 27, 8, 20);
        System.out.println(company3.companyName + " Monthly Wage: " + company3.calculateMonthlyWage());

        EmpWageBuilder company4 = new EmpWageBuilder("Company 4", 26, 4, 25);
        System.out.println(company4.companyName + " Monthly Wage: " + company4.calculateMonthlyWage());


    }
}
