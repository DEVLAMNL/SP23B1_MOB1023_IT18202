package Lesson7_DemoCollection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class NgauNhien {

    public static void main(String[] args) {
        int TongTien = 100;
        String Tai = "Tài";
        String Xiu = "Xỉu";
        System.out.println("" + TongTien);
        System.out.println("Mời Chọn");
        Scanner sc = new Scanner(System.in);
        String MoiNhap = sc.nextLine();
        System.out.println("Mời Nhập giá :");
        int Cuoc = sc.nextInt();
        List<Integer> l = new ArrayList<>();
        l.add(1);
        l.add(2);
        l.add(3);
        l.add(4);
        l.add(5);
        l.add(6);
        Collections.shuffle(l);
        int tong = l.get(0) + l.get(1) + l.get(2);
        if (MoiNhap == Tai || MoiNhap == Xiu) {
            if (tong > 11 ) {
                System.out.println("ăn" + Cuoc * 1.9);
                int an = Cuoc + TongTien;
                System.out.println("" + an);

            }
        } else {
            int mat = TongTien - Cuoc;
            if (Cuoc > TongTien) {
                return;
            }
            System.out.println("mất" + mat);
        }

        System.out.println(" Điểm : " + tong);
        ;

    }

}
