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
public class Sosanh2Chuoi {
        public static void main(String[] args) {
        
        // take two string inputs
        Scanner input = new Scanner(System.in);
        String first = input.nextLine();
        String second = input.nextLine();
        
        // compare two strings
        boolean result = first.equals(second);
        
        // print the result
        System.out.println(result);
    
        input.close();
    }
}
