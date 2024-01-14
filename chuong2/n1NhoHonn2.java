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
public class n1NhoHonn2 {
        public static void main(String[] args) {
     
        // get two inputs
        Scanner input = new Scanner(System.in);
        int n1 = input.nextInt();
        int n2 = input.nextInt();
     
        // if number1 is smaller than number2, print number1
        // if not, print number2
        if(n1<n2) {
          System.out.println(n1);
        }
        else System.out.println(n2);
        input.close();
    }
}
