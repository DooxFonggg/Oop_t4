/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chuong8;

/**
 *
 * @author phong
 */
public class Employee {
        // fields
    String name;
    Double currentSalary;
    Double newSalary;
 
    // initialize value of name and currentSalary
    Employee(String name, String currentSalary) {
        this.name = name;
        this.currentSalary = currentSalary;
    }
 
    // compute new salary
    public void setSalary(double percentage) {
        this.newSalary = (this.currentSalary + (percentage/100)*this.currentSalary);
    }
 
    // return the new salary
    public double getSalary() {
        return this.newSalary;
    }
}
