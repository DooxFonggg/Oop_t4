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
class Polygon {
    void display() {
        System.out.println("A Polygon is created");
    }
}

// inherit Rectangle and Triangle class from Polygon
class Rectangle extends Polygon {
}
class Triangle extends Polygon {
}
public class btNhieuLopKeThua1Lop {
        public static void main(String[] args) {
        
        // create object of both Rectangle and Triangle
        Rectangle rect = new Rectangle();
        Triangle trian = new Triangle();

        // access the method of Polygon using rect and trian
        rect.display();
        trian.display();
    }
}
