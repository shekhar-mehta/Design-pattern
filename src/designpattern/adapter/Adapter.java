package designpattern.adapter;

import designpattern.adapter.thirdParty.ThirdPartyLeaveRecord;

public class Adapter implements LeaveRecord{

    ThirdPartyLeaveRecord thirdPartyLeaveRecord;

    public Adapter(){
        thirdPartyLeaveRecord = new ThirdPartyLeaveRecord();
    }

    public Adapter(ThirdPartyLeaveRecord thirdPartyLeaveRecord){
        this.thirdPartyLeaveRecord = thirdPartyLeaveRecord;
    }

    @Override
    public String getMostAbsentEmployee(){
        Employee mostAbsentEmp = thirdPartyLeaveRecord.getMostAbsentEmployee();
        String name = mostAbsentEmp.getName();
        return name;
    }

    @Override
    public int getEmployeeAbsences(String employeeName){
        int employeeAbsences = thirdPartyLeaveRecord.getEmployeeAbsences(new Employee(employeeName));
        return employeeAbsences;
    }
}
