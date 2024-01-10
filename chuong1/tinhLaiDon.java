/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chuong1;

import java.util.Scanner;

/**
 *
 * @author phong
 */
public class tinhLaiDon {
        public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // get input values for principal, time, rate
        double principal = input.nextDouble();
        double time = input.nextDouble();
        double rate = input.nextDouble();
        // compute simple interest
        double Simple = ( principal * time * rate ) / 100;

        // compute final amount
        double Final  = principal + Simple;

        // print simple interest and final amount in separate lines
        System.out.println(Simple);
         System.out.println(Final);
        
        input.close();
    }
}
