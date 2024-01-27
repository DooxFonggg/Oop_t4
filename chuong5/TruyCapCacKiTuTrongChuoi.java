/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chuong5;

import java.util.Scanner;

/**
 *
 * @author phong
 */
public class TruyCapCacKiTuTrongChuoi {
        public static void main(String[] args) {

        // get input value for string
        Scanner input = new Scanner(System.in);
        String text = input.nextLine();

        // run a for loop to access each character of a string
        // hint: run loop from 0 to string.length() - 1
        for (int i=0; i<text.length(); i++) {

            // print each character of the string
            // hint: use charAt() with index specified from the loop
            System.out.println(text.charAt(i));
        }
        
        input.close();
    }
}
