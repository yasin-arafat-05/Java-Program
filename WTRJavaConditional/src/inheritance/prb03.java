/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inheritance;

/**
 *
 * @author yasin
 */
/*
10. Write a Java program that creates a class hierarchy for employees of a company. 
The base class should be Employee, with subclasses Manager, Developer, and Programmer.
Each subclass should have properties such as name, address, salary, and job title. 
Implement methods for calculating bonuses, generating performance reports, and managing projects.
*/
class Employee{
    
    private String name,address,jobtitle;
    private int salary;
    
     //for setting values use: constructor
    Employee(String name,String address,String jobtitle,int salary){
        this.name = name;
        this.address = address;
        this.jobtitle = jobtitle;
        this.salary = salary;
    }
    
    // get the value:
    public String getName(){
        return name;
    }
    
    public String getAddress(){
        return address;
    }
    public String getJobtitle(){
        return jobtitle;
    }
    
    public int getSalary(){
        return salary;
    }
    
    //printDetails:
    private void printDetails(){
        System.out.println("Name: "+name);
        System.out.println("Job Title: "+jobtitle);
        System.out.println("Address: "+address);
        System.out.println("Salary: "+salary);
    }
    
    void accessPrivateMethod(){
        printDetails();
    }
    
}

class Manager extends Employee{
    Manager(String n,String add,String job,int salary){
    super(n,add,job,salary);
    super.accessPrivateMethod();
    }
    
}
class Developer extends Employee{
    Developer(String n,String add,String job,int salary){
    super(n,add,job,salary);
    super.accessPrivateMethod();
    }
}
class Programmer extends Employee{
    Programmer(String n,String add,String job,int salary){
    super(n,add,job,salary);
    super.accessPrivateMethod();
    }
}

public class prb03 {
    public static void main(String[] args) {
        Programmer p = new Programmer("Yasin","44/4,Purbo Jamshing,Savar","Senior Programmer",45000);
        System.out.println("");
        System.out.println("");
        p.accessPrivateMethod();
    }
}

