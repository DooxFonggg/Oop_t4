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
public class DemChuSo {
        public static void main(String[] args) {

        // get input value for number
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        int count = 0;

        // loop until the number becomes 0.
        // in each iteration remove last digit of number by dividing with 10
        // increase the value of count 
        while(number != 0) {
          count++;
          number /= 10;
        }

        // print the count outside the loop
        System.out.println(count);

        input.close();

    }
}
