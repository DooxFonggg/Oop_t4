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
public class KiemTraSoDuong {
        public static void main(String[] args) {
     
        // get integer input
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
     
        // check if number is positive
        if (number > 0) {
            System.out.println("positive");
        }
        else if(number < 0) System.out.println("negative");
        else System.out.println("zero");
     
        input.close();
     
    }
}
