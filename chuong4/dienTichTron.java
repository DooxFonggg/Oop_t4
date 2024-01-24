/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chuong4;

import java.util.Scanner;

/**
 *
 * @author phong
 */
public class dienTichTron {
    
    // computeArea() method with double parameters: radius and pi
    // calculate the area of circle and return it
    double dientich(double a) {
      return a*a*3.14;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // get input value for radius
        double radius = input.nextDouble();

        // variable to store the value of pi
        double pi = 3.14;

        dienTichTron obj = new dienTichTron();

        // call computeArea() with parameters: radius and pi
        double result = obj.dientich(radius );
        System.out.println(result);

        input.close();
    }
}
