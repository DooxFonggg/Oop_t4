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
public class ghepChuoi {
        public static void main(String[] args) {
        
        // take two string inputs
        Scanner input = new Scanner(System.in);
        String firstName = input.nextLine();
        String lastName = input.nextLine();
        
        // join strings using concat
        // add a space between two strings
        // Hint: Join first string with a space " " and
        // join the resulting string with second string
        String joinedString = firstName.concat(" ");
        joinedString = joinedString.concat(lastName);
        
        System.out.println(joinedString);
        
        input.close();
    }
}
