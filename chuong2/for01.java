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
public class for01 {
        public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        // get integer input from the user
        int n = input.nextInt();

        // create multiplication table form 6 to 9
        for(int i = 6; i<=9; i++) {
          System.out.println(n + " times " + i +" is " + n*i);
        }
        input.close();
    }
}
