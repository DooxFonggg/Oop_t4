/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chuong4;

import java.awt.Point;
import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author phong
 */
public class point {
public static void main(String[] args) {
        int row = 3;
        int col = 4;
     ArrayList<Point> listPoint = new ArrayList<Point>();
     for (int i = 0; i < row; i++) {
	for (int j = 0; j < col; j++) {
		listPoint.add(new Point(i, j));
	}
}
     int size = listPoint.size();
     int pointIndex = rand.nextInt(size);
     int check = listPoint.get(pointIndex).x;
     System.out.println(check);
}
}
