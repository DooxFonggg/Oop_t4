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

public class tinhChiSoBMI {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        // get input values for weight and height
        double weight= input.nextDouble();
        double height = input.nextDouble();
        
        // calculate BMI
        double BMI = weight / (height * height);
        
        // print the BMI
        System.out.println(BMI);
    }   
}
