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
public class latSo {
    
    // method to reverse a number
    int findReverse(int number) {
        int reversed = 0;
        int remainder;

        // run a while loop until number is equal to 0
        // inside the loop, find the reverse of number
        // hint: use logic number % 10 to find the last digit
        // add last digit to reversed using logic: reversed * 10 + last digit
        while(number != 0) {
         reversed = reversed*10+number%10;
          number /= 10;
         
        } 
        
        return reversed;
    }

    public static void main(String[] args) {

        // get input value for number
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        latSo obj = new latSo();

        // call findReverse() with argument, number
        int result = obj.findReverse(number);
        System.out.println(result);
        
        input.close();
    }
}
