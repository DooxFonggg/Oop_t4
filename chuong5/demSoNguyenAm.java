/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chuong5;

/**
 *
 * @author phong
 */
import java.util.Scanner;

public class demSoNguyenAm {
        public static void main(String[] args) {

        // get input value for string
        Scanner input = new Scanner(System.in);
        String text = input.nextLine();

        // convert the string input to lowercase for simplicity
        // hint: use toLowerCase() method
        text = text.toLowerCase();

        // variable to count the number of vowels
        int vowels = 0;

        // run a for loop to access each character of a string
        // hint: run loop from 0 to string.length() - 1
        for (int i = 0; i<text.length(); ++i) {

            // access each character using charAt()
            char x = text.charAt(i);

            // check if each character is vowel of not
            // hint: compare x with all vowel characters using ||
            if (x == 'a' || x=='e'||x=='i'||x=='o'||x=='u') {
                // increase the value of vowels by 1
                vowels++;
            }
        }

        System.out.println(vowels);
        input.close();
    }
}
