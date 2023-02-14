/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lesson11_MultiThreading;

/**
 *
 * @author Admin
 */
public class MyRunnable implements Runnable {

    public MyRunnable(String name) {
        this.name = name;
    }

    private String name;

    @Override
    public void run() {
        System.out.println(this.name);
    }

}
