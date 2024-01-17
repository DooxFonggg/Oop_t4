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
public class luongThuong {
        public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // get input values for salary and year of service
        double salary = input.nextDouble();
        double serviceYear = input.nextDouble();

        // check if serviceYear is greater than 5
        if (serviceYear > 5) {

            // compute the bonus and print it 
            // hint: 5% bonus is equal to (5 * salary) / 100
            salary = (salary*5/100);
            
        }
        System.out.println(salary);
        input.close();
    }
}
