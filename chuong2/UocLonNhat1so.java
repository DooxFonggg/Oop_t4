/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chuong2;

/**
 *
 * @author phong
 */
import java.util.Scanner;
public class UocLonNhat1so {
        public static void main(String[] args) {

        // get input value for number
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        // run the loop from i = number - 1 to 1
        for (int i = number-1; i>=1; --i) {

            // check if number is divisible by i
            // if true, print the value of i and break the loop
            if (number % i == 0) {
                System.out.println(i);
                break;
            }
        }

        input.close();
    }
}
