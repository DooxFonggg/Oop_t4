/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chuong3;

import java.util.Scanner;

/**
 *
 * @author phong
 */
public class tinhGiaTriTbCuaPhanTu {
       public static void main(String[] args) {
        
        // create object of Scanner
        Scanner input = new Scanner(System.in);
        
        // create double array of size 5
        double[] numbers = new double[5];
        
        // get input value for the array
        for (int index = 0; index < numbers.length; ++index) {
            numbers[index] = input.nextDouble();
        }
        
        double sum = 0.0;
        
        // add all array elements
        for (int i=0; i<numbers.length; i++) {
            // find the sum
            sum += numbers[i];
        }
        
        // find the average
        double average = sum/numbers.length;
        System.out.println(average);
        
        input.close();
    }
}
