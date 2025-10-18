/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lab5;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ICT
 */
public class bai1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Double> list = new ArrayList<>();

        while (true) {
            System.out.println("nhap so thuc");
            Double x = sc.nextDouble();
            list.add(x);

            sc.nextLine();

            System.out.println("nhap them ?(Y/N)");
            if (sc.nextLine().equals("N")) {
                break;
            }


        }
        System.out.print("ds so thuc : ");
        for (Double a : list) {
            System.out.println(a);
        }
        double sum = 0;
        for (double b : list) {
            sum = sum + b;
        }

        System.out.print("tong cua ds so thuc : " + sum);

    }
}
