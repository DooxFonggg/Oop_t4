/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chuong8;

import java.util.Scanner;

/**
 *
 * @author phong
 */
public class person {
        String name;
    
    public static void main(String[] args) {
        
        // get input values for name1 and name2
        Scanner input = new Scanner(System.in);
        String name1 = input.nextLine();
        String name2 = input.nextLine();
        
        // create objects person1 and person2
        person persion1 = new person();
        person persion2 = new person();
        // assign values of name for both objects
        persion1.name = name1;
        persion2.name = name2;
        // print values
        System.out.println(persion1.name);
        System.out.println(persion2.name);
    }
}
