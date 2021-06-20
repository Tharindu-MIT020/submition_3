package com.company.factory;

public class HourlyEmployee extends Employee {

    int hoursWoerked;
    double rate;

    public HourlyEmployee(
            String id,
            String name,
            int hoursWoerked,
            double rate
            ){

        this.id = id;
        this.name = name;
        this.hoursWoerked = hoursWoerked;
        this.rate = rate;


    }

    @Override
    public double calcSalary(){
        return this.hoursWoerked * rate;
    }


}
