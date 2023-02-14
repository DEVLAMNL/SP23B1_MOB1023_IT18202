/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lesson10_FileIOStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class DemoFileIOStream {

    public static void main(String[] args) {
        String Filename = "Demo_Filename.txt";
        ghiFile(Filename);
        docFile(Filename);
    }

    public static void ghiFile(String Filename) {
        File file = new File(Filename);
        if (file.exists() == false) {
            System.out.println("File không tồn tại ");
            return;
        }
        try {
            FileOutputStream fos = new FileOutputStream(file);
            String s = "Hello poly";
            byte[] b = s.getBytes();
            fos.write(b);
            fos.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("File chưa tồn tại");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void docFile(String Filename) {
        File file = new File(Filename);
        if (file.exists() == false) {
            System.out.println("File không tồn tại ");
            return;
        }

        try {
            FileInputStream fis = new FileInputStream(file);
            while (true) {
                int i = fis.read();
                if (i == -1) {
                    break;
                }
                System.out.println((char)i);
            }
            fis.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("File chưa tồn tại");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
