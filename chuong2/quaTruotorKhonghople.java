/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chuong2;

import java.util.Scanner;

/**
 *
 * @author phong
 */
public class quaTruotorKhonghople {
        public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // get input value for marks
        int n = input.nextInt();

        // check if user has entered valid marks or not
        // also check if the student passed or failed
        // hint: use if...else if ladder
        if(n < 0 || n > 100) System.out.println("Invalid Marks");
        else if(n > 40) System.out.println("Pass");
        else System.out.println("Fail");
        input.close();
    }
}
