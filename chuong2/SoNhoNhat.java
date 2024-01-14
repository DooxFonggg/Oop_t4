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
public class SoNhoNhat {
        public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
 
        // take three int input 
        int n1 = input.nextInt();
        int n2 = input.nextInt();
        int n3 = input.nextInt();

        // print true if n3 is the smallest number
        // print false if n3 is not the smallest number
        if(n3 < n1 && n3 < n2) {
          System.out.println("true");
        }
        else {
          System.out.println("false");
        };
    }
}
