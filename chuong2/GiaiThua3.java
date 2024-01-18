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
public class GiaiThua3 {
        public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // get input value for number
        int number = input.nextInt();

        int factorial = 1;

        // run a for loop from i = 1 to i <= number
        // inside the loop multiply factorial with i
        for(int i=2; i<=number; i++) {
          factorial *= i;
        }

        // print factorial
        
        System.out.println(factorial);
        
        input.close();
    }
}
