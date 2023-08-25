package designpattern.strategy;

public class Employee extends GenericEmployee{
    private int maxAllowedLeaves;
    ValidatorStrategy strategy;

    @Override
    public void setSalary(int salary) {
        super.setSalary(salary);
        this.salary = salary;
    }

    @Override
    public void setMonthsSpent(int months) {
        super.setMonthsSpent(months);
        this.monthsSpent = months;
    }

    public void setMaxAllowedLeaves(int leaves) {
        strategy = new AtleastValidator();
        strategy.validateData(new String[]{String.valueOf(leaves), String.valueOf(1)});
        this.maxAllowedLeaves = leaves;
    }
}
