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
public class GiaiThua {
        
    // create the computeFactorial() method with a parameter
    int giaithua(int n) {

        int factorial = 1;

        // run a for loop from 1 to the method parameter
        for (int i=1; i<=n; i++) {
            factorial = factorial * i;
        }
        // return factorial
        return factorial;
    }

    public static void main(String[] args) {
        GiaiThua obj = new GiaiThua();

        // get user input
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        // call the method with input value as parameter
        int total = obj.giaithua(n);
        System.out.println(total);

        input.close();
    }
}
