/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aggeragation;

/**
 *
 * @author yasin
 */
class Address{
    String city,country,state;
    Address(String city,String country, String state){
        this.city = city;
        this.country = country;
        this.state = state;
    }
}

class Employee{
    int id;
    String name;
    
    // has-a relationship or aggregation
    Address ad; 
    
    Employee(int id,String name,Address ad){
        this.id = id;
        this.name = name;
        this.ad = ad;
    }
    
    void display(){  
        System.out.println("id: "+id+" \n"+"Name: "+name);  
        
        System.out.println(ad.city+" "+ad.state+" "+ad.country);  
    }  
    
}

public class example {
    public static void main(String[] args) {
        Address ad = new Address("Savar","Bangadesh","Joypara");
        Employee newEmployee = new Employee(12,"Yasin Arafat",ad);
        newEmployee.display();
    }
}
