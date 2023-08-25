package designpattern.strategy;

public class SeniorEmployee extends CompanyMember{
    private int setMaxBonus;
    ValidatorStrategy strategy;

    @Override
    public void setSalary(int salary) {
        super.setSalary(salary);
        strategy = new AtleastValidator();
        strategy.validateData(new String[]{String.valueOf(salary), String.valueOf(200)});
        this.salary = salary;
    }

    @Override
    public void setMonthsSpent(int months) {
        strategy = new AtleastValidator();
        strategy.validateData(new String[]{String.valueOf(months), String.valueOf(60)});
        this.monthsSpent = months;
    }

    public void setMaxBonus(int bonus) {
        strategy = new AtleastValidator();
        strategy.validateData(new String[]{String.valueOf(bonus), String.valueOf(1)});
        this.setMaxBonus = bonus;
    }
}
