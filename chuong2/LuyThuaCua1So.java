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
public class LuyThuaCua1So {
        public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // get input value for number and power
        int number = input.nextInt();
        int power = input.nextInt();
        
        // variable to store the power of number
        int result = 1;

        // run a loop from 1 to power
        for (int i = 1; i <= power; i++) {
            // inside the loop multiply number with result
            result *= number;
        } 

        // print the result
        System.out.println(result);
        input.close();
    }
}
