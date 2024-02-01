/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chuong9;

/**
 *
 * @author phong
 */
// Replace ___ with your code
class Animal {

    // method to print statement
    void eat() {
        System.out.println("I can eat.");
    }
}

// inherit a Dog class from Animal
class Dog extends Animal {
    // method inside the Dog
    void dance() {
        System.out.println("Dancing Dog.");
    }
}
public class btKeThua02 {
     public static void main(String[] args) {
        
        // create object of the Dog class
        Dog obj = new Dog();
        
        // call the eat() 
        obj.eat();
        
        // call the dance()
        obj.dance();
    }
}
