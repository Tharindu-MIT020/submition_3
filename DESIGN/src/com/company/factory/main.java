package com.company.factory;

import java.util.Scanner;

public class main {

    public static void main(String[] args){



        System.out.println("enter the emply type");
        Scanner scanner = new Scanner(System.in);
        String type = scanner.next();

        System.out.println("enter the name");
        String name = scanner.next();


        System.out.println("enter the hours worked");
        int hoursWorke = scanner.nextInt();

        System.out.println("enter the rate");
        double rate = scanner.nextDouble();

        EmployeeFactory employeeFactory = new EmployeeFactory();
        Employee employee = employeeFactory.getInstance(type, name, hoursWorke, rate);


        System.out.println("salary is:" + employee.calcSalary());

    }
}
