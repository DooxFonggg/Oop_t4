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
public class timSoNhoNhat {
        public static void main(String[] args) {

        // create an array
        int[] numbers = new int[5];

        // get input values for numbers
        Scanner input = new Scanner(System.in);
        for(int i=0; i < numbers.length; i++) {
          numbers[i] = input.nextInt();
        }
        
        // create a variable smallest and assign the first element of numbers to it
        int smallest = numbers[0];

        // run a for loop from i = 1 to i < numbers.length
        for (int i=1; i<numbers.length; i++) {

            // check if array element is smaller than smallest
            // if true, assign the element to smallest
            if(numbers[i] < smallest) smallest =numbers[i];
        }

        // print smallest
        System.out.println(smallest);

        input.close();
    }
}
