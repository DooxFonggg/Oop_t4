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
public class chieuCaoTb {
        public static void main(String[] args) {

        // array to store height
        double[] heights = new double[11];

        // get input for heights
        Scanner input = new Scanner(System.in);
        for(int i = 0; i < heights.length; ++i) {
            heights[i] = input.nextDouble();
        }

        double sum = 0.0;

        // find the sum of all the heights
        for(double x : heights) {
          sum += x;
        }

        // find the mean height and print it
        double mean = sum/11;
        System.out.println(mean);

        input.close();
    }
}
