package com.company.factory;

public class EmployeeFactory {

    public Employee getInstance(String type, String name, int hoursWorke, double rate){
        Employee employee = null;

        if (type.equals("hourly")){
            employee = new HourlyEmployee("1", name, hoursWorke, rate);
        }

        if (type.equals("Monthly")){
            employee = new MonthlyEmployee("2", name, rate);
        }
        else if(type.equals("daily")){
            //todo
        }


        return employee;

    }
}
