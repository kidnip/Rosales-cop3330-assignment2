package ex39;

import java.util.*;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 first_name last_name
 */
public class RecordSorter {
    public static Employee[] sortList(Employee[] employees, int number){
        Employee temp;
        for(int i = 0; i < number; i++){
            for(int j = i + 1; j < number; j++){
                if(employees[i].getLastName().compareTo(employees[j].getLastName()) > 0){
                    temp = employees[i];
                    employees[i] = employees[j];
                    employees[j] = temp;
                }
            }
        }
        return employees;
    }

    public static void main(String[] args){
        Employee[] employees = {
            new Employee("John", "Johnson", "Manager", "2016-12-31"),
            new Employee("Tou", "Xiong", "Software Engineer", "2016-10-05"),
            new Employee("Michaela", "Michaelson", "District Manager", "2015-12-19"),
            new Employee("Jake", "Jacobson", "Programmer", " "),
            new Employee("Jacquelyn", "Jackson", "DBA", " "),
            new Employee("Sally", "Webber", "Web Developer", "2015-12-18")
        };
        int counter = employees.length;

        employees = sortList(employees, counter);

        ArrayList<HashMap<String, Employee>> employeeList = new ArrayList<>();
        for (Employee employee : employees)
        {
            HashMap<String, Employee> employeeMap = new HashMap<>();
            employeeMap.put(employee.getLastName(), employee);
            employeeList.add(employeeMap);
        }

        System.out.println("Name                | Position          | Separation Date");
        System.out.println("--------------------|-------------------|----------------");
        for (int i = 0; i < employees.length; i++) {
            System.out.printf("%-20s|%-19s| %s\n", employeeList.get(i).get(employees[i].getLastName()).getName(),
                    employeeList.get(i).get(employees[i].getLastName()).getPosition(),
                    employeeList.get(i).get(employees[i].getLastName()).getSepDate());
        }
    }
}
