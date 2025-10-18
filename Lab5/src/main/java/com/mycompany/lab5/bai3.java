/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lab5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/** 
 *
 * @author ICT
 */
public class bai3 {
    static Scanner sc = new Scanner(System.in);
    static ArrayList<SanPham> list = new ArrayList<>();

    public static void main(String[] args) {
        menu();

    }

    public static void menu() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("-ứng dụng quản lý sản phẩm-");
            System.out.println("1.Nhập danh sách sản phẩm");
            System.out.println("2.Sắp xếp giảm dần theo giá và xuất ra màn hình");
            System.out.println("3. Tìm và xóa sản phẩm theo tên nhập từ bàn phím ");
            System.out.println("4. Xuất giá trung bình của các sản phẩm");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    nhap();
                    break;
                case 2:
                    sapxep();
                    break;
                case 3:
                    timvaxoaSP();
                    break;
                case 4:
                    xuatgiaTB();
                    break;
            }
        }
    }

    public static void nhap() {
        while (true) {
            System.out.print("nhap ten sp ");
            String ten = sc.nextLine();
            System.out.print("nhap gia sp ");
            Double gia = sc.nextDouble();
            sc.nextLine();
            list.add(new SanPham(ten, gia));
            System.out.println("ban co muon nhap them sp ko y/n");
            if (sc.nextLine().equalsIgnoreCase("n")) {
                break;
            }
        }
    }

    public static void sapxep() {
        Collections.sort(list, new Comparator<SanPham>() {
            @Override
            public int compare(SanPham o1, SanPham o2) {
                return Double.compare(o2.gia, o1.gia); // giảm dần
            }
        });

        System.out.println("Danh sách sau khi sắp xếp giảm dần theo giá:");
        for (SanPham sp : list) {
            sp.xuat();
        }
    }

    public static void timvaxoaSP() {
        System.out.println("nhap ten san pham ban can xoa");
        String tenSPCanTim = sc.nextLine();
        list.removeIf(s -> s.ten.equals(tenSPCanTim));
        System.out.println("ds sp sau khi xoa");
        for (SanPham sanPham : list) {
            System.out.println(sanPham);
        }
    }

    public static void xuatgiaTB() {
        double sum = 0;
        for (SanPham s : list) {
            sum = s.gia + sum;
        }
        int doDai = list.size();
        double giaTB = sum / doDai;
        System.out.println("gia tb cua cac sp la " + giaTB);
    }


}
