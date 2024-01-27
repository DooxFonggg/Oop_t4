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
public class CheckEquals {
    
    public static void main(String[] args) {
 
        Scanner input = new Scanner(System.in);
     
        // take input values for both string
        String str1 = input.nextLine();
        String str2 = input.nextLine();

        // compare two strings using equals()
        if (str1.equals(str2)) {
            System.out.println("Equal");
        }

        else {
            System.out.println("Not Equal");
        }

        input.close();
    }
}
