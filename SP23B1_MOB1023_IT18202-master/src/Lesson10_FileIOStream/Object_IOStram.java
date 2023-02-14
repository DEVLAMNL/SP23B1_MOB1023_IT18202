/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lesson10_FileIOStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Admin
 */
public class Object_IOStram {

    public static void main(String[] args) {
        String Filename = "Demo_Object_IO.txt";
        ghiFile(Filename);
        docFile(Filename);
    }

    public static void ghiFile(String Filename) {
        File file = new File(Filename);
        if (file.exists() == false) {
            return;
        }
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        try {
            FileOutputStream fos = new FileOutputStream(file);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(list);
            fos.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void docFile(String Filename) {
        File file = new File(Filename);
        if (file.exists() == false) {
            return;
        }
        try {
            FileInputStream fis = new FileInputStream(file);
            ObjectInputStream ois = new ObjectInputStream(fis);
            List<Integer> list = (ArrayList<Integer>) ois.readObject();
            fis.close();
        } catch (Exception e) {
        }
    }
}
