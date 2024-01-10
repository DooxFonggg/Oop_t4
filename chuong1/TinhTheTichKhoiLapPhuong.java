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
public class TinhTheTichKhoiLapPhuong {
        public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // take integer input for the length
        int length = input.nextInt();

        // compute the volume and print it
        int volume =  length * length * length;
        System.out.println(volume);

        input.close();
    }
}
