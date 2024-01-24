/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chuong4;

/**
 *
 * @author phong
 */
public class tongTu1denN {
        int computeSum(int number) {
        int total = 0;
        
        for (int i = 1; i <= number; i++) {
            total += i;
        }
        
        return total;
  }
 
    public static void main(String[] args) {
        tongTu1denN obj = new tongTu1denN();
 
        int total = obj.computeSum(10);
        System.out.println(total);
 
        total = obj.computeSum(100);
        System.out.println(total);  
  }
}
