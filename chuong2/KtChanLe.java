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
public class KtChanLe {
        public static void main(String[] args) {
     
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
     
        // check if a number is divisible by 2
        // if true, print even
        // else, print odd
        if(number%2==0) {
          System.out.println("even");
        }
        else {
          System.out.println("odd");
        }
        input.close();
    }
}
