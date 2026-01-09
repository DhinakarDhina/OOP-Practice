package InheritancePractice;

import java.util.Scanner;

public class Employee {
    String name;
    int id;

    Employee(String name, int id){
        this.name= name;
        this.id= id;
    }
     public void displayDetails(){
         System.out.println("Name: "+name);
         System.out.println("Id: "+id);
     }
}

class Manager extends Employee{
    int team_size;

    Manager(String name,int id, int team_size) {
        super(name, id);
        this.team_size = team_size;
    }
        public void displayDetails(){
            super.displayDetails();
            System.out.println("Team Size: "+team_size);

        }
}
class Engineer extends Employee{
     String specialization;

     Engineer(String name, int id, String specialization){
         super(name,id);
         this.specialization=specialization;
     }
     public void displayDetails(){
         super.displayDetails();
         System.out.println("Employee's Specialization: "+specialization);
     }
}

class Main{
    public static void main(String[]args){
        Scanner in= new Scanner(System.in);
        System.out.println("Enter the Manager Name: ");
        String managerName= in.nextLine();
        System.out.println("Enter the Manager id: ");
        int manager_id= in.nextInt();
        System.out.println("Enter the Team size: ");
        int team_size=in.nextInt();
        in.nextLine();
        System.out.println("Enter the Employee Name: ");
        String EmployeeName= in.nextLine();
        System.out.println("Enter the Employee id: ");
        int employee_id= in.nextInt();
        in.nextLine();
        System.out.println("Enter the Specilization : ");
        String specialization=in.nextLine();

        Manager m= new Manager(managerName,manager_id,team_size);
        m.displayDetails();

        Engineer e= new Engineer(EmployeeName,employee_id,specialization);
        e.displayDetails();

    }
}
