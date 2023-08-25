package solid.live_refactored.srp;

public class EmployeeFormatter {
    private Employee employee;

    //default constructor
    EmployeeFormatter(){
    }
    EmployeeFormatter(Employee employee){
        this.employee = employee;
    }

    public String toHtml() {
        String htmlData = "<div>" +
                "<h1>Employee Info</h1>" +
                "<div id='emp" + employee.getEmpId() + "'>" +
                "<span>" + employee.getName() + "</span>" +
                "<div class='left'>" +
                "<span>Leave Left :</span>" +
                "<span>Annual Salary:</span>" +
                "<span>Manager:</span>" +
                "<span>Reimbursable Leave:</span>" +
                "</div>";
        htmlData += "<div class='right'><span>" + (employee.getTotalLeaveAllowed() - employee.getLeavesTaken()) + "</span>";
        htmlData += "<span>" + Math.round(employee.getMonthlySalary() * 12) + "</span>";
        if (employee.getManager() != null)
            htmlData += "<span>" + employee.getManager() + "</span>";
        else
            htmlData += "<span>None</span>";

        htmlData += "<span>" + employee.getTotalLeavesLeftPreviously() + "</span>";
        htmlData += "</div> </div>";
        return htmlData;
    }
}
