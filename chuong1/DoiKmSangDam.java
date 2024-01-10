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

public class DoiKmSangDam {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        // take input for km
        double km = input.nextDouble();
        
        // convert km to miles
        double miles = km/1.6;

        // display value in miles
        System.out.println(miles);

        input.close();
    }    
}
