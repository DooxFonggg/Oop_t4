/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chuong1;

import java.util.Scanner;

/**
 *
 * @author phong
 */
public class HoanDoi2soXY {
        public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // get input values for x and y
        int x = input.nextInt();
        int y = input.nextInt();

        // temporary variable
        int temp;

        // swap two values using temp
        temp = x;
        x = y;
        y = temp;
        // print values after swapping
        System.out.println(x);
        System.out.println(y);
        input.close();
    }
}
