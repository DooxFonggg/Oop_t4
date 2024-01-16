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
public class for02 {
        public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        while (true) {

            int n = input.nextInt();
     
            // check if n is in between 1 and 100
            // if not, break the loop
            if(n < 1 || n > 100) {
              break;
            }
            

            // print the value of n
            System.out.println(n);
    }
        input.close();
  }
}
