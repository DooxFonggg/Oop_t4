/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chuong8;

/**
 *
 * @author phong
 */
public class Triangle {
        // create two fields
    int base;
    int height;
    
    // initialize value of base and height
    Triangle(int base, int height) {
        this.base = base;
        this.height = height;
    }
    
    // compute the area of the right-angled triangle
    double computeArea() {
        double area = (double) 1/2*(this.base*this.height);
        return area;
    }
}
