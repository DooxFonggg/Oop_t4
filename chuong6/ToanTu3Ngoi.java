/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chuong6;

import java.util.Scanner;

/**
 *
 * @author phong
 */
public class ToanTu3Ngoi {
        public static void main(String[] args) {
        
        // get input value
        Scanner input = new Scanner(System.in);
        int number1 = input.nextInt();
        int number2 = input.nextInt();
        
        // compare number1 with number2
        // if both numbers are equal, mark number1 as larger
        int larger = (number1 > number2) ? number1 : number2;
        System.out.println(larger);
  
        input.close();
    }
}
