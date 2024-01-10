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
public class ChuyenDoFsangC {
    public static void main(String[] args) {

        // take fahrenheit temperature input
        Scanner input = new Scanner(System.in);
        double fahrenheit = input.nextDouble();

        // convert fahrenheit temperature to celsius
        double celsius =  (fahrenheit - 32) * 5 / 9;

        // print temperature in celsius
        System.out.println(celsius);

        input.close();        
    }
}
