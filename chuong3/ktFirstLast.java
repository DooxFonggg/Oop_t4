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
public class ktFirstLast {
     public static void main(String[] args) {

        // declare an array of size 6
        int[] numbers = new int[6];

        Scanner input = new Scanner(System.in);

        // get input values for array elements using for loop     
        for (int i = 0; i < numbers.length; ++i) {
         numbers[i] = input.nextInt();
        }
        
        

        // first element of the array is at index 0
        int first = numbers[0];

        // last element of the array is at index array.length - 1
        int last = numbers[numbers.length-1];

        // compare first and last elements
        if (first == last) {
            System.out.println("Equal");
        }
        else {
            System.out.println("Not Equal");
        }

        input.close();
    }
}
