package ex40;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class FilterRecords
{
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

    public static Employee[] filterList(Employee[] employees, String search, int number)
    {
        ArrayList<Employee> newEmployees = new ArrayList<>();

        for(int i = 0; i < number; i++){
            if(employees[i].getLastName().contains(search)){
                newEmployees.add(employees[i]);
            }
        }
        return newEmployees.toArray(new Employee[0]);
    }

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int counter;
        String search;

        Employee[] employees =
        {
            new Employee("John", "Johnson", "Manager", "2016-12-31"),
            new Employee("Tou", "Xiong", "Software Engineer", "2016-10-05"),
            new Employee("Michaela", "Michaelson", "District Manager", "2015-12-19"),
            new Employee("Jake", "Jacobson", "Programmer", " "),
            new Employee("Jacquelyn", "Jackson", "DBA", " "),
            new Employee("Sally", "Webber", "Web Developer", "2015-12-18")
        };

        counter = employees.length;
        employees = sortList(employees, counter); //sort first
        System.out.print("Enter a search string: ");
        search = input.next();
        employees = filterList(employees, search, counter);

        ArrayList<HashMap<String, Employee>> employeeList = new ArrayList<>();
        for (Employee employee : employees)
        {
            HashMap<String, Employee> employeeMap = new HashMap<>();
            employeeMap.put(employee.getLastName(), employee);
            employeeList.add(employeeMap);
        }

        System.out.println("Name                | Position          | Separation Date");
        System.out.println("--------------------|-------------------|----------------");
        for (int i = 0; i < employees.length; i++)
        {
            System.out.printf("%-20s|%-19s| %s\n", employeeList.get(i).get(employees[i].getLastName()).getName(),
                    employeeList.get(i).get(employees[i].getLastName()).getPosition(),
                    employeeList.get(i).get(employees[i].getLastName()).getSepDate());
        }
    }
}
