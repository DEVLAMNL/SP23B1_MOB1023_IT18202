/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab1;

import java.io.Serializable;

/**
 *
 * @author Admin
 */
public class product implements Serializable {

    private String Ten;
    private double Price;

    public product() {
    }

    public product(String Ten, double Price) {
        this.Ten = Ten;
        this.Price = Price;
    }

    public String getTen() {
        return Ten;
    }

    public void setTen(String Ten) {
        this.Ten = Ten;
    }

    public double getPrice() {
        return Price;
    }

    public void setPrice(double Price) {
        this.Price = Price;
    }

    @Override
    public String toString() {
        return "product{" + "Ten=" + Ten + ", Price=" + Price + '}';
    }

}
