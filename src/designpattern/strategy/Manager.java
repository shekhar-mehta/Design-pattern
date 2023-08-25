package designpattern.strategy;

public class Manager extends CompanyMember{
    ValidatorStrategy strategy;
    private String managementBand;

    @Override
    public void setSalary(int salary) {
        super.setSalary(salary);
        this.salary = salary;
    }

    public void setMonthsSpent(int months) {
        this.monthsSpent = months;
    }

    public void setManagementBand(String managementBand) {
        strategy = new nonEmptyValidator();
        strategy.validateData(new String[]{managementBand});
        this.managementBand = managementBand;
    }
}
