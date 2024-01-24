/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chuong4;

/**
 *
 * @author phong
 */
public class soLonNhatTrong3so {
     
    int getLargestNumber(int n1, int n2, int n3) {
 
        if(n1>n2 && n1>n3) return n1;
        else if(n2>n1 && n2>n3) return n2;
        else return n3;
 
    }
 
    public static void main(String[] args) {
 
        // create object of Main class
        soLonNhatTrong3so obj = new soLonNhatTrong3so();
 
        int largestNumber = obj.getLargestNumber(3, 55, -5);
        System.out.println(largestNumber);
 
        largestNumber = obj.getLargestNumber(0, 12, 20);
        System.out.println(largestNumber);
    }
}
