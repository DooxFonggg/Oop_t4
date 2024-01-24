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
public class checkSoNghichDao {
    
    // method to reverse a number
    // hint: solve the previous challenge to understand how to reverse a number
    int dao1(int n) {
      int dao = 0;
      while(n!=0) {
        dao = dao*10+n%10;
        n /=10;
      }
      return dao;
    }
    void check(int n1, int n2) {
        if(n1==n2) System.out.println("Palindrome Number");
       else System.out.println("Not a Palindrome Number");
    }
 

    // create checkPalindrome() method with two parameters: number and reversedNumber
    // check if two numbers are equal or not
    // print Palindrome Number, if they are equal.
    // otherwise, print Not a Palindrome Number
  
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // get input value for number
        int number = input.nextInt();

        checkSoNghichDao obj = new checkSoNghichDao();

        // call findReverse() to find reverse of number
     

        // call checkPalindrome with arguments: number and reversedNumber
        // to check if number is palindrome
        int t = obj.dao1(number);
        obj.check(number, t);

        input.close();
    }
}
