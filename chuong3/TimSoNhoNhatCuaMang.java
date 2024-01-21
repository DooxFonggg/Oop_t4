/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chuong3;

/**
 *
 * @author phong
 */
public class TimSoNhoNhatCuaMang {
        public static void main(String[] args) {

        // an array of numbers
        int[] numbers = { 55, 64, 75, 80, 65 };

        // assign the first value of the array to the smallest variable
        int smallest = numbers[0];

        // iterate each element of the array
        // compare each element with the smallest
        for(int i=1; i<numbers.length; i++) {
          if(numbers[i] < smallest) smallest = numbers[i];
        }

        System.out.println(smallest);
  }
}
