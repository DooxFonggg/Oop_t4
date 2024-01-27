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
public class tanSuatXuatHien {
        public static void main(String[] args) {

        char ch = 'a';

        Scanner input = new Scanner(System.in);

        // get input value for string
        String text = input.nextLine();

        // variable to store the occurrence of 'a'
        int count = 0;

        // run a for loop to access each character of a string
        for (int i = 0; i < text.length(); ++i) {
            
            // compare each string character with the specified character
            // use the charAt() method to access the character from string
            // if match found, increase the value of count by 1
            if(text.charAt(i) == ch) count++;
        }

        System.out.println(count);

        input.close();
    }
}
