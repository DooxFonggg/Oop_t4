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
public class ghep2Chuoi {
        public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // get input values for text1 and text2
        String text1 = input.nextLine();
        String text2 = input.nextLine();
        
        // join two strings with a space in between
        // hint: join the first string with " " (empty string)
        // join the new string with the second string
        String s = text1.concat(" ");
        s = s.concat(text2);
        
        System.out.println(s);

        input.close();
    }
}
