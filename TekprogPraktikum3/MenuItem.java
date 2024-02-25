/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tekprogpr3;

/**
 *
 * @author RYZEN 3-5600H
 */
class MenuItem {
    private String itemName;
    private double itemPrice;
    private int itemStock;

    public MenuItem(String itemName, double itemPrice, int itemStock) {
        this.itemName = itemName;
        this.itemPrice = itemPrice;
        this.itemStock = itemStock;
    }

    public String getItemName() {
        return itemName;
    }

    public double getItemPrice() {
        return itemPrice;
    }

    public int getItemStock() {
        return itemStock;
    }

    public boolean isOutOfStock() {
        return itemStock <= 0;
    }

    public void decreaseStock(int quantity) {
        itemStock -= quantity;
    }
}
