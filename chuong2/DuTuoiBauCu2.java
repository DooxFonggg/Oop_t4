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
public class DuTuoiBauCu2 {
        public static void main(String[] args) {
     
        Scanner input = new Scanner(System.in);
        int age = input.nextInt();
     
        // if age is 18 or above, print: The person can vote
        // if not, print: The person cannot vote
        if(age >= 18) {
          System.out.println("The person can vote");
        }
        else {
           System.out.println("The person cannot vote");
        };
 
        input.close();
     
    }
}
