/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chuong3;

/**
 *
 * @author phong
 */
public class forEach01 {
        public static void main(String[] args) {
        
        double[] numbers = {4.2, 5.5, 2.0, 8.2, 9.6};
        
        double total = 0;
        
        // find the sum of all elements
        for (double x : numbers) {
            total += x;
        }
        
        // find the average
        double average = total/numbers.length;
        
        // print the average
        System.out.println(average);
    }
}
