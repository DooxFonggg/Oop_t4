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
public class kt2soBangNhau {
    
    // create method with two arguments
    void myMethod(int a, int b) {

        // compare two arguments
        // if they are equal, print Arguments are Equal.
        // Otherwise, print Arguments are not Equal
        if(a==b) System.out.println("Arguments are Equal");
        else System.out.println("Arguments are not Equal");
    }

    public static void main(String[] args) {

        
        Scanner input = new Scanner(System.in);

        // get input values for two numbers
        int number1 = input.nextInt();
        int number2 = input.nextInt();

        // create an object of Main
        kt2soBangNhau obj = new kt2soBangNhau();

        // use obj to call the method with number1 and number2 arguments
        obj.myMethod(number1, number2);

        input.close();
    }
}
