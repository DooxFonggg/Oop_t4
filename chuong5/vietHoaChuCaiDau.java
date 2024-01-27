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
public class vietHoaChuCaiDau {
        public static void main(String[] args) {

        // get input value for string
        Scanner input = new Scanner(System.in);
        String text = input.nextLine();

        // use substring() to split the input string to two strings
        // first substring contains the first letter
        // hint: to access first letter, use indexes 0 and 1
        String firstLetter = text.substring(0,1);

        // second substring contains the remaining letters
        // hint: to use remaining letters, use indexes 1 and string.length()
        String remainingLetters = text.substring(1,text.length());

        // change the first letter to uppercase
        firstLetter = firstLetter.toUpperCase();

        // join the two substrings
        text = firstLetter.concat(remainingLetters);
        System.out.println(text);

        input.close();
    }
}
