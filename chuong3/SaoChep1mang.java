/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chuong3;

/**
 *
 * @author phong
 */
public class SaoChep1mang {
        public static void main(String[] args) {
 
        // an array of numbers
        int[] numbers = { 55, 64, 75, 80, 65 };
 
        // declare new array of the same size
        int n = numbers.length;
        int[] newNumbers = new int[n];
 
        // loop through each element of numbers
        for (int i=0; i<n; i++) {
            newNumbers[i] = numbers[i];
        }
 
        // print the new array
        for (int i=0; i<n; i++) {
            System.out.println(newNumbers[i]);
        }
    }
}
