/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chuong1;

/**
 *
 * @author phong
 */
import java.util.Scanner;
     
public class tinhDoanhThuBanHang {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        // get input values for sellingPrice and costPrice
        int sellingPrice = input.nextInt();
        int costPrice = input.nextInt();
        
        // calculate the profit or loss amount and print it
        int profitLoss = sellingPrice-costPrice;
        System.out.println(profitLoss);

        input.close();
    } 
}
