/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chuong1;

/**
 *
 * @author phong
 */
public class GiamHocPhi {
        public static void main(String[] args) {

        double fee = 1536;
        double discountPercent = 10;

        // compute discount amount
        double discount = fee*discountPercent/100;

        double finalFee = fee-discount;
        System.out.println(finalFee);

    }
}
