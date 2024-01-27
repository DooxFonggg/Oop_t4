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
public class inKiTuKhongPhaiChuCai {
        public static void main(String[] args) {

        // get input value for string
        Scanner input = new Scanner(System.in);
        String text = input.nextLine();
        text = text.toLowerCase();
        // run a for loop to access each character of a string
        // hint: run loop from 0 to string.length() - 1
        for (int i=0; i<text.length(); i++) {

            // access each character using charAt()
            char x = text.charAt(i);

            // check if the string falls in the range from 'a' to 'z' or 'A' to 'Z'
            // hint: use >= 'a' and <= 'z' for both cases
            if (x>='a' && x <= 'z') {
                // if true, skip the current iteration of loop
                continue;
            }

            // print x if it doesn't fall in the range
            System.out.println(x);
        }

        input.close();
    }
}
