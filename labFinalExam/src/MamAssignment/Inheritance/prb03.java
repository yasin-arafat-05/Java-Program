/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MamAssignment.Inheritance;
import java.util.Scanner;
/**
 *
 * @author yasin
 */
/*
Create a class named 'Member' having the following members:
Data members
1 - Name
2 - Age
3 - Phone number
4 - Address
5 – Salary
It also has a method named 'printSalary' which prints the salary of the members.
Two classes 'Employee' and 'Manager' inherits the 'Member' class. The 'Employee' and
'Manager' classes have data members 'specialization' and 'department' respectively. Now,
assign name, age, phone number, address and salary to an employee and a manager by
making an object of both of these classes and print the same.
*/
class Member{
    String Name,Phone_Number,Address;
    int Age,Salary;

    public Member(String Name, String Phone_Number, String Address, int Age, int Salary) {
        this.Name = Name;
        this.Phone_Number = Phone_Number;
        this.Address = Address;
        this.Age = Age;
        this.Salary = Salary;
    }
    
    void printSalary(){
        System.out.println("Salary of "+Name+" is : "+Salary);
    }
    
}

class Manager extends Member{
    String Name,Phone_Number,Address;
    int Age,Salary;
    String Department;
    public Manager(String Name,String Phone_Number,String Address,int Age,int Salary,String Department) {
        super(Name,Phone_Number,Address,Age,Salary);
        this.Department = Department;
    }
}


class Employee extends Member{
    String Name,Phone_Number,Address;
    int Age,Salary;
    String Specilization;
    public Employee(String Name,String Phone_Number,String Address,int Age,int Salary,String Specilization) {
        super(Name,Phone_Number,Address,Age,Salary);
        this.Specilization = Specilization;
    }
}


public class prb03 {
    public static void main(String[] args) {
        System.out.println("Enter the  value of n: ");
        Scanner sc = new Scanner(System.in);
       int  n = sc.nextInt();
        
        for(int i=0;i<n;i++){
        Employee e = new Employee("Yasin", "0123234", "44/1", 0, 0, "C++");
        e.printSalary();
        System.out.println("");
        }
        
        Manager m = new Manager("kaka", "354543", "address", 0, 0, "Programming");
        m.printSalary();
        
    }
}
