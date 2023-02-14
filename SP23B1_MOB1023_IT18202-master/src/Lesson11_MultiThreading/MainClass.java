/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lesson11_MultiThreading;

/**
 *
 * @author Admin
 */
public class MainClass {

    public static void main(String[] args) {

        MyRunnable mrb = new MyRunnable("Kê bàn"),
                mrb1 = new MyRunnable("Lau bàn");
        Thread loc = new Thread(mrb),
                Hieu = new Thread(mrb1);
        loc.start();
        Hieu.start();
    }
}
