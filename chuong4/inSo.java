/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chuong4;

/**
 *
 * @author phong
 */
public class inSo {
    
    // create a method to print two numbers 5 and 100
    void  printNumbers(int n) {
      System.out.println(n);
    }
    

    public static void main(String[] args) {

        // object of Main class
        inSo obj = new inSo();

        // call the method two times using obj
        for(int i=0; i<2; i++) {
           obj.printNumbers(5);
            obj.printNumbers(100);
        }
    }
}
