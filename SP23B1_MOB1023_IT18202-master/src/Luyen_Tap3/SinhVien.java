/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Luyen_Tap3;

import java.io.Serializable;

/**
 *
 * @author Admin
 */
public class SinhVien implements Serializable {

    private String hoTen;
    private double diem;
    private String nganh;
    private String hocLuc;
    private boolean thuong;

    public SinhVien() {
    }

    public SinhVien(String hoTen, double diem, String nganh, String hocLuc, boolean thuong) {
        this.hoTen = hoTen;
        this.diem = diem;
        this.nganh = nganh;
        this.hocLuc = hocLuc;
        this.thuong = thuong;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public double getDiem() {
        return diem;
    }

    public void setDiem(double diem) {
        this.diem = diem;
    }

    public String getNganh() {
        return nganh;
    }

    public void setNganh(String nganh) {
        this.nganh = nganh;
    }

    public String getHocLuc() {
        return hocLuc;
    }

    public void setHocLuc(String hocLuc) {
        this.hocLuc = hocLuc;
    }

    public boolean isThuong() {
        return thuong;
    }

    public void setThuong(boolean thuong) {
        this.thuong = thuong;
    }

    public Boolean Thuong() {
        boolean co = true;
        boolean khong = false;
        if (thuong == true) {
            return co;
        } else {
            return khong;
        }
    }

    public String HocLuc() {
        String Yeu = "Yếu";
        String Kha = "Khá";
        String XuatSac = "Xuất Sắc";
        if (diem <= 5) {
            return Yeu;
        } else if (diem <= 7 && diem > 5) {
            return Kha;
        } else {
            return XuatSac;
        }
    }

}
