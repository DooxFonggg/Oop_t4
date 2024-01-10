/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chuong1;

/**
 *
 * @author phong
 */
import java.util.Scanner;
public class LayNhieuGiaTriDauVao {
    public static void main(String[] args) {

        // create object of Scanner
        Scanner input = new Scanner(System.in);

        // get integer input
        int intInput = input.nextInt();

        // get double input
        double doubleInput = input.nextDouble();

        // print input values
        System.out.println(intInput);
        System.out.println(doubleInput);

        // close the Scanner object
        input.close();
    }
}
