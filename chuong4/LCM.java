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
public class LCM {
        // create the findLCM() method with parameters: num1 and num2
    // compute lcm of two values and return it
    int findLCM(int n1, int n2) {
      int t = Math.max(n1,n2);
      while(true) {
        t++;
        if(t%n1==0 && t%n2==0) {
          break;
        }
      }
      return t;
    }

    public static void main(String[] args) {

        // get input values for x and y
        Scanner input = new Scanner(System.in);
        int number1 = input.nextInt();
        int number2 = input.nextInt();

        LCM obj = new LCM();
        
        // call findLCM() with arguments number1 and number2
        int lcm = obj.findLCM(number1,number2);
                
        System.out.println(lcm);

        input.close();
    }
}
