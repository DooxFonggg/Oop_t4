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
public class BtPhuongThucChuoi {
        
    public static void main(String[] args) {
        
        // get string inputs
        Scanner input = new Scanner(System.in);
        String first = input.nextLine();
        String second = input.nextLine();
        
        // get length of both strings
        int firstLength = first.length();
        int secondLength = second.length();
        
        // compare the length of strings
        if (firstLength < secondLength) {
            System.out.println(first);
        }
        else {
            System.out.println(second);
        }
        
        input.close();
    }
}
