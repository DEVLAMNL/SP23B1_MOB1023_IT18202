package LuyenTap;

public class People {

    private String hoTen;
    private String diaChi;
    private boolean gioiTinh;

    public People() {
    }

    public People(String hoTen, String diaChi, boolean gioiTinh) {
        this.hoTen = hoTen;
        this.diaChi = diaChi;
        this.gioiTinh = gioiTinh;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public boolean getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(boolean gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String Gioitinh() {
        String Gioitinh = "Nam";
        String Gioitinh1 = "Nữ";
        if (gioiTinh == true) {
            return Gioitinh;
        } else {
            return Gioitinh1;
        }
    }

}
