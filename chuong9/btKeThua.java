/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chuong9;

/**
 *
 * @author phong
 */
class Vehicle {
    void getFeature() {
        System.out.println("Initializing vehicle features");
    }
}

// derive Car from Vehicle
class Car extends Vehicle {
  
}
public class btKeThua {
        public static void main(String[] args) {
        
        // create an object of Car
        Car car1 = new Car();

        // access the getFeature method
        car1.getFeature();
    }
}
