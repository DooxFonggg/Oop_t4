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

public class kiTuCuoiCung {
        public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        // get String input
        String text = input.nextLine();
        
        // find the last character of the string
        // Hint: The last character of the string is at position length - 1
        char last = text.charAt(text.length()-1);
        System.out.println(last);

        input.close();
    }
}
