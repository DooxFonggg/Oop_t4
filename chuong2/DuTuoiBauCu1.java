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
public class DuTuoiBauCu1 {
        public static void main(String[] args) {
     
        Scanner input = new Scanner(System.in);
        int age = input.nextInt();
     
        // check if age is greater than or equal to 18
        if (age >= 18) {
            // print The person can vote if true
            System.out.println("The person can vote.");
        } 
    }
}
