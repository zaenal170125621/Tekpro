/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tekprogpr3;

/**
 *
 * @author RYZEN 3-5600H
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


class Restaurant {
    private List<MenuItem> menuItems;
    private List<String> orders;
    private List<Double> prices;

    public Restaurant() {
        menuItems = new ArrayList<>();
        orders = new ArrayList<>();
        prices = new ArrayList<>();
    }

    public void addMenuItem(String itemName, double itemPrice, int itemStock) {
        MenuItem menuItem = new MenuItem(itemName, itemPrice, itemStock);
        menuItems.add(menuItem);
    }

    public void displayMenu() {
    for (int i = 0; i < menuItems.size(); i++) {
        MenuItem menuItem = menuItems.get(i);
        if (menuItem.isOutOfStock()) {
            System.out.println((i + 1) + ". " + menuItem.getItemName() + " [HABIS]");
        } else {
            System.out.println((i + 1) + ". " + menuItem.getItemName() + " [" + menuItem.getItemStock() + "] Rp. " + menuItem.getItemPrice());
        }
    }
}

    public void takeOrder(int itemNumber, int quantity) {
    MenuItem menuItem = menuItems.get(itemNumber - 1);
    if (menuItem.getItemStock() >= quantity) {
        // Penambahan pesanan hanya dilakukan jika stok mencukupi
        double totalPrice = menuItem.getItemPrice() * quantity;
        orders.add(menuItem.getItemName() + " (x" + quantity + ")");
        prices.add(totalPrice);
        menuItem.decreaseStock(quantity);
        System.out.println(menuItem.getItemName() + " (x" + quantity + ") telah ditambahkan ke pesanan.");
    } else {
        // Jika stok tidak mencukupi, beri pesan bahwa item tersebut sudah habis
        System.out.println("Maaf, stok " + menuItem.getItemName() + " tidak mencukupi.");
    }
}


    public void displaySales() {
        System.out.println("\nPesanan Anda:");
        double totalSales = 0;
        for (int i = 0; i < orders.size(); i++) {
            String order = orders.get(i);
            double price = prices.get(i);
            System.out.println(order + "\tRp. " + price);
            totalSales += price;
        }
        System.out.println("Total: Rp. " + totalSales);
    }

    public String getMenuItemName(int choice) {
        if (choice >= 1 && choice <= menuItems.size()) {
            return menuItems.get(choice - 1).getItemName();
        }
        return null;
    }

    public void takeOrder(int choice) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Pilih jumlah item " + getMenuItemName(choice) + " yang ingin dipesan (0 untuk selesai): ");
        int quantity = scanner.nextInt();
        if (quantity > 0) {
            takeOrder(choice, quantity);
        } else {
            System.out.println("Pilihan tidak valid.");
        }
    }

    public int getMenuSize() {
        return menuItems.size();
    }
}
