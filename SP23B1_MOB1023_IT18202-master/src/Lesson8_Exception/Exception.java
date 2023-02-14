/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lesson8_Exception;
public class Exception {

    public static void main(String[] args) {
        String[] list = {"1", "2", "3", null, "Nguyễn Văn B"};

        for (int i = 0; i < 10; i++) {
            try {
                String a = list[i];
                int j = Integer.parseInt(a);
                System.out.println(j);
            } catch (IndexOutOfBoundsException ex) {
                ex.printStackTrace();
            }
        }
    }

//    public static int StrToInt(String s)throw Exception{
//        try {
//            int i = Integer.parseInt(s);
//            return i;
//        } catch (Exception e) {
//
//        }
//    }
}
