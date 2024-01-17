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
public class bangTinhNhan {
        public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // take input value for number
        int n = input.nextInt();

        int count = 1;
        
        // use while loop to run up to count <= 10
        // inside the loop multiply number with count and print the multiplication table
        // increase count by 1 in each iteration
        while(count <= 10) {
          System.out.println(n + " * "+count+" = " + n*count);
          count++;
        }

        input.close();
    }
}
