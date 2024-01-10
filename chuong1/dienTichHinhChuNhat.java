/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chuong1;

/**
 *
 * @author phong
 */
import java.util.Scanner;

public class dienTichHinhChuNhat {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        // take input for length and breadth
        int length = input.nextInt();
        int breadth = input.nextInt();
     
        // calculate area of rectangle   
        int area = length*breadth;
        System.out.println(area);

        input.close();
    }
}
