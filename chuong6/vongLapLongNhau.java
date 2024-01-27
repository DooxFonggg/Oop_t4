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
public class vongLapLongNhau {
        public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        // iterate the outer loop n times
        for (int i = 0; i<n; ++i) {

            // iterate the inner loop 2 times
            for (int j = 0; j<2; ++j) {
                System.out.println("*");
            }
        }

        input.close();
    }
}
