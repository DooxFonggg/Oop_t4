/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chuong1;

import java.util.Scanner;

/**
 *
 * @author phong
 */
public class BaiToanChiaKeo {
        public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // get input values for chocolate and children
        int chocolate = input.nextInt();
        int children = input.nextInt();
        
        // find the number of chocolate each child gets
        // hint: use / operator
        int keo = chocolate/children;
        int du = chocolate%children;
        // find the remaining chocolates
        // hint: use % operator
    
        // print the result values
        System.out.println(keo);
        System.out.println(du);

        input.close();
    }
}
