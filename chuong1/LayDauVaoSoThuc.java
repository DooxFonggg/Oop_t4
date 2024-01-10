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

public class LayDauVaoSoThuc {
    public static void main(String[] args) {

        // create object of Scanner
        Scanner input = new Scanner(System.in);

        // get salary input
        double salary = input.nextDouble();

        // get bonus input
        double bonus = input.nextDouble();;

        // find total income
        double income = salary+bonus;

        System.out.println(income);

        // close the Scanner object
        input.close();
    }
}
