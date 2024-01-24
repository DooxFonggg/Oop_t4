/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chuong4;

import java.util.Scanner;

/**
 *
 * @author phong
 */
public class tinhLaiDon {
        // simpleInterest() method with double parameters: principal, time, rate
    // calculate the simple interest and return it
    double laidon(double p, double t, double r) {
      return (p*t*r)/100;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // get input value for principal, time, and rate
        double principal = input.nextDouble();
        double time = input.nextDouble();
        double rate = input.nextDouble();

        tinhLaiDon obj = new tinhLaiDon();

        // call simpleInterest() with arguments principal, time, and rate
        double c = obj.laidon(principal,time,rate);

        // print the returned value
        System.out.println(c);
        
        input.close();
    }
}
