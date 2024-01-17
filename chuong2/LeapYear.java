/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chuong2;

import java.time.Year;
import java.util.Scanner;

/**
 *
 * @author phong
 */
public class LeapYear {
        public static void main(String[] args) {

        // get input value for year
        Scanner input = new Scanner(System.in);
        int year = input.nextInt();

        // check if year is divisible by 400
        if (year %400 == 0) {
            System.out.println("Leap Year");
        }
        // check if the year is divisible by 4 and doesn't end with 00
        else if (year %4==0 && year%100 != 0) {
            System.out.println("Leap Year");
        }
        // otherwise print Not a Leap Year
        else {
          System.out.println("Not a Leap Year");
        }
        
        
        input.close();
    }
}
