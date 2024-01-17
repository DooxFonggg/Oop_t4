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
public class Fizzbuzz {
        public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // get input value for number
        int number = input.nextInt();

        // check if number is multiple of both 3 and 5
        if (number%3 == 0 && number%5 == 0) {
            System.out.println("FizzBuzz");
        }

        // check if number is multiple of 3
        else if (number%3 == 0) {
            System.out.println("Fizz");
        }

        // check if number is multiple of 5
        else if (number%5 == 0) {
            System.out.println("Buzz");
        }

        else {
            System.out.println(number);
        }
         
        input.close();
    }
}
