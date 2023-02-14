/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Luyen_Tap3;

import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class Sinhvien_Service implements ISinhvien_Service {

    private ArrayList<SinhVien> listSV = new ArrayList<>();

    @Override
    public void insert(SinhVien sv) {
        listSV.add(sv);
    }

    @Override
    public void update(int i, SinhVien sv) {
        listSV.set(i, sv);
    }

    @Override
    public void delete(int i) {
        listSV.remove(i);
    }

    @Override
    public ArrayList<SinhVien> Select() {
        return listSV;
    }

    @Override
    public void setList(ArrayList<SinhVien> sv) {
        this.listSV = sv;
    }

}
