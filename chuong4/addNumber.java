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
public class addNumber {
        
    // method that adds two double number
    void addNumbers(double n1, double n2) {
        // add two numbers and print the result
        System.out.println(n1+n2);
    }

    public static void main(String[] args) {
        
        // take input value
        Scanner input = new Scanner(System.in);
        double number1 = input.nextDouble();
        double number2 = input.nextDouble();
        
        // creating object of Main class
        addNumber obj = new addNumber();
    
        // call the method with arguments number1 and number2
        obj.addNumbers(number1,number2);

        input.close();
    }
}
