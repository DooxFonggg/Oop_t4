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
    
    // method
    void displayInfo() {
        System.out.println("Four Wheeler or Two Wheeler");
    }
}

// inherit the Car class from Vehicle
class Car extends Vehicle {

    // override the displayInfo method and 
    // print Cars are Four Wheeler
    void displayInfo() {
      System.out.println("Cars are Four Wheeler");
    }
}
public class ghiDePhuongThucLopCha {
       public static void main(String[] args) {

        // create an object of Car
        Car car1 = new Car();

        // call the displayInfo() method
        car1.displayInfo();
    }
}
