/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chuong3;

import java.util.Scanner;

/**
 *
 * @author phong
 */
public class NhanMangVs10 {
        public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // create an array
        int[] numbers = new int[5];
        for(int i=0; i<numbers.length; i++) {
          numbers[i] = input.nextInt();
        }
        int n[] = new int[5];
        
        // get input values for numbers using a for loop
        for(int i =0; i<5; i++) {
          n[i] = numbers[i]*10;
        }

        // access array elements using the foreach loop 
        // multiply each element by 10 and print it
        for(int x: n) {
          System.out.println(x);
        }

        input.close();
    }
}
