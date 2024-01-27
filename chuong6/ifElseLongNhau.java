/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chuong6;

import java.util.Scanner;

/**
 *
 * @author phong
 */
public class ifElseLongNhau {
        public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        // get university input
        String university = input.nextLine();
        
        // get marks input
        int marks = input.nextInt();
        
        // outer if condition to check the university
        if ( university.equals("Unique University")) {
            
            // passing mark for this university is 80
            if (marks >= 80) {
                System.out.println("Student Passed");
            }
            else {
                System.out.println("Student Failed");
            }
        }
        // if the student is not from the Unique University
        else {
            
            // passing mark for all other universities is 32
            if (marks >= 32) {
                System.out.println("Student Passed");
            }
            else {
                System.out.println("Student Failed");
            }
        }
        
        input.close();
    }
}
