/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chuong2;

import java.util.Scanner;

/**
 *
 * @author phong
 */
public class SumDenKhiNhap0 {
        public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int number;
        int sum = 0;

        // run a while loop that breaks only if input value is 0
        // take input value for number inside the loop
        // if input value is other than 0, add the value to sum
        while(true) {
          number = input.nextInt();
          sum += number;
          if(number == 0) {
            break;
          }
        }
        
        // print the sum
        System.out.println(sum);
        
        input.close();
    }
}
