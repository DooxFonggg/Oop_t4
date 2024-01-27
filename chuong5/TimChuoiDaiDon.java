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
public class TimChuoiDaiDon {
        public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // get input values for text1 and text2
        String text1 = input.nextLine();
        String text2 = input.nextLine();

        // get length of both strings
        int length1 = text1.length();
        int length2 = text2.length();

        // compare lengths of both strings and print the longer sting
        if(length1 > length2) System.out.println(text1);
        else System.out.println(text2);
        
        input.close();
    }
}
