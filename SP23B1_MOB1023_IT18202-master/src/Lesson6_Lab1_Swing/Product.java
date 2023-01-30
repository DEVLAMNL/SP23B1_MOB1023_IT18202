/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lesson6_Lab1_Swing;

/**
 *
 * @author Admin
 */
public class Product {

    private String Name;
    private double price;

    public Product() {
    }

    public Product(String Name, double price) {
        this.Name = Name;
        this.price = price;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

}
