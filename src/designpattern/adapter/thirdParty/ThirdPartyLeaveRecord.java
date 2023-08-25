package designpattern.adapter.thirdParty;

import designpattern.adapter.Employee;

import java.util.Hashtable;
import java.util.Map;
import java.util.Stack;

public class ThirdPartyLeaveRecord {
    private Map<Employee, Integer> employees = new Hashtable<Employee, Integer>() {
        {
            put(new Employee("Bond, James"), 5);
            put(new Employee("Powers, Austin"), 7);
            put(new Employee("Dhruv, Super Commando"), 10);
        }

        Stack<String> stack = new Stack<String>();
        String t = stack.push("abc");

    };

    public int getEmployeeAbsences(final Employee employee) {
        return employees.get(employee);
    }

    public Employee getMostAbsentEmployee() {
        Employee mostAbsentEmployee = null;
        Integer maxLeaves = Integer.MIN_VALUE;
        for (Employee employee : employees.keySet()) {
            Integer leavesTaken = employees.get(employee);
            if (leavesTaken > maxLeaves) {
                maxLeaves = leavesTaken;
                mostAbsentEmployee = employee;
            }
        }
        return mostAbsentEmployee;
    }
}
