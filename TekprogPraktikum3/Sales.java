/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tekprogpr3;

/**
 *
 * @author RYZEN 3-5600H
 */
import java.util.ArrayList;
import java.util.List;

class Sales {
    private List<Product> sales;

    public Sales() {
        sales = new ArrayList<>();
    }

    public void addSale(String productName, int quantity, double total) {
        Product sale = new Product(productName, 0, quantity); // Harga tidak disimpan di sini, karena dapat berubah
        sales.add(sale);
    }

    public void displaySales() {
        double totalSales = 0;
        for (Product sale : sales) {
            System.out.println("- " + sale.getProductName() + " x " + sale.getProductQty());
        }
        for (Product sale : sales) {
            totalSales += sale.getProductPrice() * sale.getProductQty();
        }
        System.out.println("Total Bayar: Rp. " + totalSales);
    }
}