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
public class Nhan2so {
    
    // create method
    int getProduct(int number1, int number2) {
    // find the product and return it
    int product = number1*number2;
     
    return product;
 }

    public static void main(String[] args) {

        // get int input from the user
        Scanner input = new Scanner(System.in);
        int n1 = input.nextInt();
        int n2 = input.nextInt();

        // create object of the class
       Nhan2so obj = new Nhan2so();

        // call the method with arguments n1 and n2
        // store the returned value in the result variable

        int result = obj.getProduct(n1, n2);

        // print result
        System.out.println(result);

        input.close(); 
    }
}
