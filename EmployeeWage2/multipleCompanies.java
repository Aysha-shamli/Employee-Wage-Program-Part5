package EmployeeWage2;
class CompanyEmpWage {
    private final String companyName;
    private final int hourlyWage;
    private final int hoursWorked;
    private final int workingDaysPerMonth;
    private int totalWage;

    public CompanyEmpWage(String companyName, int hourlyWage, int hoursWorked, int workingDaysPerMonth) {
        this.companyName = companyName;
        this.hourlyWage = hourlyWage;
        this.hoursWorked = hoursWorked;
        this.workingDaysPerMonth = workingDaysPerMonth;
        this.totalWage = 0; // Initialize total wage to 0
    }

    public void calculateMonthlyWage() {
        totalWage = hourlyWage * hoursWorked * workingDaysPerMonth;
    }

    public void displayMonthlyWage() {
        System.out.println(companyName + " Monthly Wage: " + totalWage);
    }
}
class EmpWageBuilder {
    private CompanyEmpWage[] companyEmpWages;
    public EmpWageBuilder() {
        this.companyEmpWages = new CompanyEmpWage[0];
    }
    public void addCompany(String companyName, int hourlyWage, int hoursWorked, int workingDaysPerMonth) {
        CompanyEmpWage companyEmpWage = new CompanyEmpWage(companyName, hourlyWage, hoursWorked, workingDaysPerMonth);
        CompanyEmpWage[] newArray = new CompanyEmpWage[companyEmpWages.length + 1];
        System.arraycopy(companyEmpWages, 0, newArray, 0, companyEmpWages.length);
        newArray[companyEmpWages.length] = companyEmpWage;
        companyEmpWages = newArray;
    }

    public void calculateAndDisplayWages() {
        for (CompanyEmpWage companyEmpWage : companyEmpWages) {
            companyEmpWage.calculateMonthlyWage();
            companyEmpWage.displayMonthlyWage();
        }
    }
}

public class multipleCompanies {
    public static void main(String[] args) {
        EmpWageBuilder empWageBuilder = new EmpWageBuilder();

        empWageBuilder.addCompany("Company 1", 25, 8, 22);
        empWageBuilder.addCompany("Company 2", 30, 6, 20);
        empWageBuilder.addCompany("Company 3", 27, 8, 20);
        empWageBuilder.addCompany("Company 4", 26, 4, 25);

        empWageBuilder.calculateAndDisplayWages();
    }
}
