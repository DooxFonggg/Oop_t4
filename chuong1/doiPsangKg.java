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
public class doiPsangKg {
        public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        
        // get input value for pound
        double p = input.nextDouble();
        
        // convert pound to kg and print value in kg
        double kg = p * 0.453592;
        System.out.println(kg);
        input.close();
    }
}
