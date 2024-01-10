/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chuong1;

import java.util.Scanner;

/**
 *
 * @author phong
 */
public class TinhSobatTaylonNhat {
     public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        
        // get input value for students
        int n = input.nextInt();

        // find the possible handshakes and print it
        int combination = (n * (n - 1)) / 2;
        System.out.println(combination);
        input.close();
    }
}
