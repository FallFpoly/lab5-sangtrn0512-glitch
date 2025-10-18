/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab5;

/**
 *
 * @author sang
 */
public class SanPham {
    String ten;
    Double gia;

    public SanPham(String ten, Double gia) {
        this.ten = ten;
        this.gia = gia;
    }

    public void xuat() {
        System.out.println("ten : " + ten + "\ngia : " + gia);
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public Double getGia() {
        return gia;
    }

    public void setGia(Double gia) {
        this.gia = gia;
    }

}
