package com.basicsstrong.behavioralPatterns.visitorPattern;

import java.util.ArrayList;
import java.util.List;

public class Organisation {

    static List<Employee> employeeList;

    static {
        employeeList = new ArrayList<Employee>();

        Employee bod = new Employee("Bob");
        Employee alex = new Employee("Alex");
        Employee nick = new Employee("Nick");

        employeeList.add(bod);
        employeeList.add(alex);
        employeeList.add(nick);

    }

    public static void ratings(){
        CEO ceo = new CEO("Mr. George");
        for(Employee employee:  employeeList){
            employee.accept(ceo);
        }
    }
}
