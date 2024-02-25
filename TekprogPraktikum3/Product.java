/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tekprogpr3;

/**
 *
 * @author RYZEN 3-5600H
 */
class Product {
    private String productName;
    private double productPrice;
    private int productQty;

    public Product(String productName, double productPrice, int productQty) {
        this.productName = productName;
        this.productPrice = productPrice;
        this.productQty = productQty;
    }

    public String getProductName() {
        return productName;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public int getProductQty() {
        return productQty;
    }

    public void decreaseStock(int quantity) {
        productQty -= quantity;
    }
}
