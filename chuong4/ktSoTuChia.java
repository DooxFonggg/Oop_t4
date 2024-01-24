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
public class ktSoTuChia {
        // method to check self dividing number
    boolean checkSelfDivide(int number) {
        int num = number;
        int digit;

        while (num != 0) {
            // access each digit of num
            // hint: use num % 10 to get the last digit
            digit = num%10;

            // check if any digit doesn't divide the number
            // if it doesn't, return false
            if(num%digit != 0) return false;

            // remove the last digit of num
            num = num / 10;

        }

        // if all digit divide number
        return true;
    }
    
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // get input value for number
        int number = input.nextInt();

       ktSoTuChia obj = new ktSoTuChia();

        // call checkSelfDivide() with the number argument
        boolean result = obj.checkSelfDivide(number);

        // if result is true, print Self Dividing Number
        // otherwise, print Not a Self Dividing Number
        if(result) System.out.println("Self Dividing Number");
        else System.out.println("Dividing Number");

        input.close();
    }
}
