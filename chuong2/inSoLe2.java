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
public class inSoLe2 {
        public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // take integer input from user
        int n = input.nextInt();
        
        for (int i = 1; i <= n; ++i) {
            
            // if i is even, skip the printing of i
            if(i%2 == 0) continue;
            
            // print the value of i
            System.out.println(i);
        }
        input.close();
    }
}
