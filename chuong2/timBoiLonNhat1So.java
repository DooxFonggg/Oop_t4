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
public class timBoiLonNhat1So {
       public static void main(String[] args) {

        // get input value for number
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        
        // run a for loop from i = 100 to 1
        for (int i = 100; i >number; --i) {

            // check if i is divisible by number
            // if true, print i and exit the loop
            if(i%number==0) {
              System.out.println(i);
              break;
            }
        }

        input.close();
    }
}
