/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chuong4;

import java.util.Scanner;

/**
 *
 * @author phong
 */
public class soNguyenToTrongDoan {
    
    // method to check prime number
    // return true if the number is prime, else return false
    // hint: Use the same logic from the previous challenge
    boolean check(int t) {

      for(int i=2; i<t; i++) {
        if(t%i == 0){
          return false;
        }
      }
      return true;
    }
    
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // get input value for two intervals
        int x = input.nextInt();
        int y = input.nextInt();

        soNguyenToTrongDoan obj = new soNguyenToTrongDoan();

        // run a loop to access each value in interval x and y
        for (int i = x; i <= y; ++i) {

            // call checkPrime for every value between x and y
            boolean result = obj.check(i);

            // if returned value is true, print the number
            if(result) {
              System.out.println(i);
            }
        }

        input.close();
    }
}
