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
public class ktGoc180 {
       public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // get 3 input values for angles
        int x = input.nextInt();
        int y = input.nextInt();
        int z = input.nextInt();

        // find the sum of all angles
        if(x+y+z == 180) System.out.println("true");
        else System.out.println("false");
        // check if sum is equal to 180 and print either true or false
        
        input.close();
    }
}
