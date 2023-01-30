/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Lesson6_Lab1_Swing;

import java.util.ArrayList;

public interface IProduct_Service {

    public void Insert(Product p);

    public void Update(int i, Product p);

    public void Delete(int i);

    public ArrayList<Product> Select();
}
