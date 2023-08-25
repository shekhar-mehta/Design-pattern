package designpattern.strategy;

public class GenericEmployee extends CompanyMember{

    ValidatorStrategy strategy;
    public void setSalary(int salary) {
        super.setSalary(salary);
        strategy = new AtmostValidator();
        strategy.validateData(new String[]{String.valueOf(salary),"1000"});
    }

    public void setManagerName(String name) {
        super.setManagerName(name);
        strategy =new nonEmptyValidator();
        strategy.validateData(new String[]{name});
        this.mgrName = name;
    }

    public void setMonthsSpent(int months) {
        strategy = new AtleastValidator();
        strategy.validateData(new String[]{"String.valueOf(months)", "0"});
    }
}
