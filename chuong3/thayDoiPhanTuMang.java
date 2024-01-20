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
public class thayDoiPhanTuMang {
        public static void main(String[] args) {
        
        // create integer array
        int[] primeNumber = {2, 3, 5, 7};
        
        // get integer input
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        // assign number to the fourth element of primeNumber
        primeNumber[3] = number;

        // print array elements
        for (int i=0; i<primeNumber.length; i++) {
            System.out.println(primeNumber[i]);
        }

        input.close();
    }
}
