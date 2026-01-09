package EmployeeSalaryDetails;

import java.util.Scanner;

public class Employee {
    public String name;
    protected int employeeId;
    private double salary;

    //constructor
    Employee(String name, int employeeId, double salary){
        this.name= name;
        this.employeeId= employeeId;

        if(salary<0){
            System.out.println("Invalid salary");
        }
        else{
            this.salary= salary;
        }
    }

    //setting the salary of the employee
    public void setSalary(double salary){
        if(salary<0){
            System.out.println("Invalid salary");
            this.salary=0;
        }
        else{
            this.salary= salary;
        }
    }

    //Getting the salary of the employee
    public double getSalary(){
        return this.salary= salary;
    }

    //Displaying the employee details

    public void displayEmployeeDetails(){
        System.out.println("Name: "+name);
        System.out.println("EmployeeId: "+employeeId);
        System.out.println("Salary: "+salary);
    }
}
class main{
    public static void main(String []args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the name: ");
        String name= in.nextLine();
        System.out.println("Enter the employeeId: ");
        int employeeId =in.nextInt();
        System.out.println("Enter the salary: ");
        double salary= in.nextDouble();
        Employee e = new Employee(name, employeeId,salary);
        e.setSalary(salary);
        e.getSalary();
        e.displayEmployeeDetails();

    }

}
