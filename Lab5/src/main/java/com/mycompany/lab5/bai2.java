/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lab5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author ICT
 */
public class bai2 {
    static Scanner sc = new Scanner(System.in);
    static ArrayList<String> hoTenList = new ArrayList<>();

    public static void main(String[] args) {
        menu();
    }
    public static void menu() {
        int choice;
        do {
            System.out.println("+---------------------------------------------------+");
            System.out.println("1. Nhập danh sách họ và tên");
            System.out.println("2. Xuất danh sách svien");
            System.out.println("3. Xuất danh sách ngẫu nhiên");
            System.out.println("4. Sắp xếp giảm dần và xuất danh sách");
            System.out.println("5. Tìm và xóa họ tên");
            System.out.println("6. Kết thúc");
            System.out.println("+---------------------------------------------------+");
            System.out.print("Mời bạn chọn chức năng: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    nhap();
                    break;
                case 2:
                    xuat();
                    break;
                case 3:
                    xuatngaunhien();
                    break;
                case 4:
                    sapxepgiamdan();
                    break;
                case 5:
                    xoa();
                    break;
                case 6:
                    break;
                default:
                    System.out.println("lua chon sai ,nhap lai");
                    break;

            }
        } while (choice != 6);
        sc.nextLine();
    }
    public static void nhap() {
        System.out.println("nhap ho ten - nhap xong de ket thuc");
        while (true) {
            String hoten = sc.nextLine();
            if (hoten.equalsIgnoreCase("xong")) {
                System.out.println("user bam xong,ket thuc nhap");
                break;
            }
            hoTenList.add(hoten);
        }
    }

    public static void xuat() {

        System.out.println("--danh sach sinh vien--");
        for (String string : hoTenList) {
            System.out.println(string);
        }
    }

    public static void xuatngaunhien() {
        System.out.println("--xuat ngau nhien ds--");
        Collections.shuffle(hoTenList);
        xuat();
    }

    public static void sapxepgiamdan() {
        System.out.println("--xuat ds giam dan--");
        Collections.sort(hoTenList);
        Collections.reverse(hoTenList);
        xuat();
    }

    public static void xoa() {
        sc.nextLine();
        System.out.println("nhap ten can xoa");
        String tencanxoa = sc.nextLine();
        if (hoTenList.remove(tencanxoa)) {
            System.out.println("xoa thanh cong");
        } else {
            System.out.println("ten ko ton tai ");
        }
        System.out.println("--danh sach sinh vien sau khi xoa");
        xuat();
    }

    }

