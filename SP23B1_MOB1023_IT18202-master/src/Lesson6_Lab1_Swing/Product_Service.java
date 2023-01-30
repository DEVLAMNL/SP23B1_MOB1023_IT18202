package Lesson6_Lab1_Swing;

import java.util.ArrayList;

public class Product_Service implements IProduct_Service {

    private ArrayList<Product> listProduct = new ArrayList<>();

    @Override
    public void Insert(Product p) {
        listProduct.add(p);
    }

    @Override
    public void Update(int i, Product p) {
        listProduct.set(i, p);
    }

    @Override
    public void Delete(int i) {
        listProduct.remove(i);
    }

    @Override
    public ArrayList<Product> Select() {
        return this.listProduct;
    }

}
