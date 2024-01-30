/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chuong8;

/**
 *
 * @author phong
 */
public class Student {
        
    String name;
    int score;
    
    void checkPassFail() {
        
        if (score >= 35) {
            System.out.println(this.name + " passed the exam.");
        }
        else {
            System.out.println(this.name + " failed the exam.");
        }
    }
}
 
// Main Clas