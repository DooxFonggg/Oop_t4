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
public class uocChungNhoNhat {
    
    // create the findGCD() method with parameters: num1 and num2
    // compute gcd of two numbers and return it
    int findGCD(int n1, int n2) {
      int gcd = 1;
      for(int i=2; i<=n1 && i<=n2; i++) {
        if(n1%i == 0 && n2%i==0) gcd = i;
      }
      return gcd;
    }
    public static void main(String[] args) {

        // get input values for two numbers
        Scanner input = new Scanner(System.in);
        int number1 = input.nextInt();
        int number2 = input.nextInt();

        uocChungNhoNhat obj = new  uocChungNhoNhat();

        // call the findGCD() method
        int gcd = obj.findGCD(number1, number2);
        System.out.println(gcd);

        input.close();
    }
}
