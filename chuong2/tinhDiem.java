/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chuong2;

import java.util.Scanner;

/**
 *
 * @author phong
 */
public class tinhDiem {
     public static void main(String[] args) {

        // get input value for marks
        Scanner input = new Scanner(System.in);
        double marks = input.nextDouble();

        // check the value of marks and assign grade based on the value
        if(marks >= 90) System.out.println("A");
        else if(marks >= 80) System.out.println("B");
        else if(marks >= 70) System.out.println("C");
        else  System.out.println("D");
        input.close();
    }
}
