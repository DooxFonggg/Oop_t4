/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chuong4;

import java.util.Scanner;

/**
 *
 * @author phong
 */
public class canBac3 {
        public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        // get number input
        int number = input.nextInt();
        
        // use the cbrt() method to find the cube root
        double cubeRoot = Math.cbrt(number);
        System.out.println(cubeRoot);
        
        input.close();
    }
}
