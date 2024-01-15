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
public class inSoLe {
        public static void main(String[] args) {
     
        // take input value for n
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        // iterate from i = 1 to n (n should be inclusive)
        for (int i=1; i<=n; i++) {
         
            // check if i is odd
            // if true, print i
            if (i%2 != 0) {
                System.out.println(i);
            }
        }
        input.close();
    }
}
