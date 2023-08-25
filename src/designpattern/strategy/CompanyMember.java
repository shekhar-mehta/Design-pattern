package designpattern.strategy;

public abstract class CompanyMember {
    private String name;
    protected String mgrName;
    protected int salary;
    protected int monthsSpent;

    ValidatorStrategy strategy;

    public void setName(String name) {
        strategy = new LengthValidator();
        strategy.validateData(new String[]{name, "50"});
        this.name = name;
    }
    public void setSalary(int salary) {

        strategy = new AtleastValidator();
        strategy.validateData(new String[]{String.valueOf(salary), "1"});
    }
    public void setManagerName(String name) {
        strategy = new LengthValidator();
        strategy.validateData(new String[]{name, "50"});
    }

    public abstract void setMonthsSpent(int months);
}
