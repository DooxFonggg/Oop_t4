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
public class PhanTramDiemHS {
        public static void main(String[] args) {

        // create a double array
        double n[] = new double[8];

        // get input values for obtained marks
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < n.length; ++i) {
            n[i] = input.nextDouble();
        }

        // create a variable to store obtainedMarks
        double obtainedMarks = 0.0;
        
        // find the sum of obtained marks using a loop
        for(double x: n) {
         obtainedMarks += x;
        }

        // create totalMarks variable
        int totalMarks = 800;
        
        // find the percentage and print it
        double percentage = (obtainedMarks/totalMarks)*100;
        System.out.println(percentage);

        input.close();
    }
}
