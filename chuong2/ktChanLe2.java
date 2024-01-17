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
public class ktChanLe2 {
        public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // get input value for number
        int number = input.nextInt();

        // check if number is even or not
        // hint: use % 2 to check if number is perfectly divisible by 2
        // if result is 0, print Even. Otherwise, print Odd
        if(number%2 == 0) System.out.println("Even");
        else System.out.println("Odd");

        input.close();
    }
}
