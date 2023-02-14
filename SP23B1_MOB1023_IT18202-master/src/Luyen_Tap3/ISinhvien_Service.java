package Luyen_Tap3;

import java.util.ArrayList;

public interface ISinhvien_Service {

    public void insert(SinhVien sv);

    public void update(int i, SinhVien sv);

    public void delete(int i);

    public ArrayList<SinhVien> Select();

    public void setList(ArrayList<SinhVien> sv);
}
