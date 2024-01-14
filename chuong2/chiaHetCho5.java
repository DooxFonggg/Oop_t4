/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chuong2;

/**
 *
 * @author phong
 */
import java.util.Scanner;

public class chiaHetCho5 {
      public static void main(String[] args) {
 
        Scanner input = new Scanner(System.in);
        // get integer input from the user
        int number = input.nextInt();

        // print true if number is divisible by 5, otherwise print false
        System.out.println(number%5==0);
        // Hint: You may have to use the % operator
        input.close();
    }
}
