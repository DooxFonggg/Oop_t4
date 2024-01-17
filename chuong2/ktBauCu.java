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
public class ktBauCu {
        public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // get input value for age
        int age = input.nextInt();

        // check if the person is eligible to vote
      if(age >= 18) System.out.println("Can Vote");
      else System.out.println("Cannot Vote");
         
        input.close();
    }
}
