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
public class GiaiThua2 {
        public static void main(String[] args) {

        // take integer input
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        int total = 1;

        // run for loop from i = 1 to i = n
        for (int i=1; i<=n; i++) {
        // multiply value of i to total and assign to total
        total *= i;
        }

        System.out.println(total);
        input.close();
    }
}
