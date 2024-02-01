/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chuong9;

import java.util.Scanner;

/**
 *
 * @author phong
 */
class Polygon {
    void displayInfo() {
        System.out.println("A polygon is a two dimensional shape with straight lines.");
    }

    int getPerimeter(int[] sides) {
        int perimeter = 0;
        // find sum of all sides
        for (int side : sides) {
            perimeter = perimeter + side;
        }

        return perimeter;
    }
}

// inherit the Quadrilateral class withs displayInfo() method
class Quadrilateral extends Polygon{
  void displayInfo() {
    System.out.println("A quadrilateral is a polygon with 4 sides.");
  }
}
public class btGhiDe {
      public static void main(String[] args) {
        
        // create an object of Quadrilateral
        Quadrilateral q = new Quadrilateral();

        // sides of triangle
        int[] quadrilateralSides = new int[4];
        
        // get sides input
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < quadrilateralSides.length; ++i) {
            quadrilateralSides[i] = input.nextInt();
        }

        // call getPerimeter using q1
        int perimeter = q.getPerimeter(quadrilateralSides);
        System.out.println(perimeter);

        // call displayInfo() method
        q.displayInfo();

        input.close();
    }
}
