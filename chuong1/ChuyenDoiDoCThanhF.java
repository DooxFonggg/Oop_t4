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

public class ChuyenDoiDoCThanhF {
        public static void main(String[] args) {

        // create object class of Scanner class 
        Scanner input = new Scanner(System.in);
        // take temperature in degree celsius from the user
        double c = input.nextDouble();
        // convert degree to fahrenheit
        double covertCtoF = (c*1.8)+32;
 
        // print degree in fahrenheit
        System.out.println(covertCtoF);
        input.close();
    }
}
