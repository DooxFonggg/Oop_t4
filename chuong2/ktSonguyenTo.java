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
public class ktSonguyenTo {
        public static void main(String[] args) {

        // get input value for number
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        // create a flag variable with value 0
        int flag = 0;

        // run loop from 2 to number - 1
        // check if number is divisible by number between 2 to number - 1
        for(int i =2; i<number; i++) {
          if(number%i == 0) flag = 1;
        }

        // check if flag is 1 and print either Not a Prime Number or Prime Number
        if(flag == 1) System.out.println("Not a Prime Number");
        else  System.out.println("Prime Number");
        
        input.close();
    }
}
