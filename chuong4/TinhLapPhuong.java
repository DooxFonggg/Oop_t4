/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chuong4;

/**
 *
 * @author phong
 */
public class TinhLapPhuong {
        // create a method named findCube()
    void findCube() {
        int number = 5;
        
        // find the cube of number
        int result = (int) Math.pow(number,3);
        System.out.println(result);
    }

    public static void main(String[] args) {

        // creating object of Main class
        TinhLapPhuong obj = new TinhLapPhuong();
    
        // call findCube using the object
        obj.findCube();
  }
}
