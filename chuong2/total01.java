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
public class total01 {
        public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // the initial value of total will be 0
        int total = 0;
        int num;
        
        while (true) {
            // get an integer input
            num = input.nextInt();
            
            // check if the input is less than or equal to 0
            // break the loop if true
            // else add the value to total
            if(num < 0) {
                break;
            }
            total += num;
            
        }
        
        // print the total
        System.out.println(total);
        input.close();
    }
}
