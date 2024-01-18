/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chuong2;

/**
 *
 * @author phong
 */
public class KhongPhaiBoiCua3 {
       public static void main(String[] args) {

        // loop from i = 1 to 10
        // inside the loop, check whether i is divisible by 3
        // if true, skip the current iteration of the loop. Otherwise, print i
        for(int i=0; i<=10; i++) {
          if(i%3 == 0) {
            continue;
          }
          else {
            System.out.println(i);
          }
        }
        
    }
}
