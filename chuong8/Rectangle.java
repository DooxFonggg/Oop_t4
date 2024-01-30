/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chuong8;

/**
 *
 * @author phong
 */
public class Rectangle {
        
    // integer fields
    int length;
    int breadth;
    
    // constructor of the class
    // initialize the value of length and breadth
    Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }
    
    // method to compute the area of rectangle
    void calculateArea() {
        int area = this.length * this.breadth;
        System.out.println(area);
    }
}
