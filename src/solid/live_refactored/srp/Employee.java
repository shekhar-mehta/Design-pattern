package solid.live_refactored.srp;

public class Employee {
    private int empId;
    private String name;
    private String manager;
    private double monthlySalary;
    private int yearsInOrg;

    private String addressStreet;
    private String addressCity;
    private String addressCountry;

    private final static int TOTAL_LEAVES_ALLOWED = 30;
    private int leavesTaken;
    private int[] leavesLeftPreviously;


    public Employee(int empId, double monthlySalary, String name, String addressStreet, String addressCity, String addressCountry, int leavesTaken, int[] leavesLeftPreviously, String manager) {
        this.empId = empId;
        this.monthlySalary = monthlySalary;
        this.name = name;
        this.addressStreet = addressStreet;
        this.addressCity = addressCity;
        this.addressCountry = addressCountry;
        this.leavesTaken = leavesTaken;
        this.leavesLeftPreviously = leavesLeftPreviously;
        this.yearsInOrg = leavesLeftPreviously.length;
        this.manager = manager;
    }

    public Employee() {
    }

    public int getEmpId() {
        return empId;
    }

    public String getName() {
        return name;
    }

    public String getManager() {
        return manager;
    }

    public double getMonthlySalary() {
        return monthlySalary;
    }

    public int getLeavesTaken() {
        return leavesTaken;
    }

    public int getTotalLeaveAllowed() {
        return TOTAL_LEAVES_ALLOWED;
    }

    public int getYearsInOrg() {
        return yearsInOrg;
    }

    public String getAddress() {
        return addressStreet + addressCity + addressCountry;
    }

    public int getTotalLeavesLeftPreviously(){
        int year = Math.min(yearsInOrg, 3);
        int totalLeaveLeftPreviously = 0;
        for(int i=0;i<year;i++){
            totalLeaveLeftPreviously += leavesLeftPreviously[yearsInOrg-i-1];
        }
        return totalLeaveLeftPreviously;
    }
}
