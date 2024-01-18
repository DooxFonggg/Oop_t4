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
public class KtSoAmstrong {
       public static void main(String[] args) {

        // get input value for number
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        // assign the number to another variable originalNumber
        int originalNumber = number;
        String n = Integer.toString(number);
        int dem = n.length();
        
        // sum variable to store the sum of cubes
        int sum = 0;

        // variable to access each digit of number
        int remainder;

        // loop to find the cubes of each digit
        while (originalNumber != 0) {

            // use originalNumber % 10 to get the last digit
            remainder = originalNumber%10;
            // add the cube of the last digit to sum
            sum +=  Math.pow(remainder, dem);
            // use originalNumber / 10 to change the value of originalNumber
            originalNumber /= 10;
        }

        // check if sum is equal to number
        if (sum == number) {
            System.out.println("Armstrong Number");
        }
        else {
            System.out.println("Not an Armstrong Number");
        }
        
        input.close();
    }
}
