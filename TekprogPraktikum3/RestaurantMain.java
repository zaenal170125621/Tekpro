/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tekprogpr3;

/**
 *
 * @author RYZEN 3-5600H
 */

import java.util.Scanner;

public class RestaurantMain {
    public static void main(String[] args) {
        Restaurant restaurant = new Restaurant();
        restaurant.addMenuItem("Bala-Bala", 1000, 20);
        restaurant.addMenuItem("Gehu", 1000, 20);
        restaurant.addMenuItem("Tahu", 1000, 20);
        restaurant.addMenuItem("Molen", 1000, 20);
        restaurant.addMenuItem("Kentang Goreng", 1500, 20);
        restaurant.addMenuItem("Pisang Goreng", 1500, 20);
        restaurant.addMenuItem("Martabak", 2000, 20);
        restaurant.addMenuItem("Bakso", 5000, 20);
        restaurant.addMenuItem("Soto", 7000, 20);
        restaurant.addMenuItem("Nasi Goreng", 8000, 20);

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\nMenu Makanan:");
            restaurant.displayMenu();
            System.out.println("\nPesan item makanan? (Masukkan nomor item, ketik '0' untuk selesai): ");
            String input = scanner.next();
            if (input.equals("0")) {
                System.out.println("Terima kasih atas pesanan Anda.");
                break;
            } else {
                try {
                    int choice = Integer.parseInt(input);
                    if (choice >= 1 && choice <= restaurant.getMenuSize()) {
                        System.out.print("Pilih jumlah item " + restaurant.getMenuItemName(choice) + " yang ingin dipesan (0 untuk selesai): ");
                        int quantity = scanner.nextInt();
                        if (quantity == 0) {
                            continue; // Mengulangi loop untuk memesan item lain
                        }
                        if (quantity > 0) {
                            restaurant.takeOrder(choice, quantity);
                        } else {
                            System.out.println("Jumlah tidak valid. Harap masukkan jumlah item yang benar.");
                        }
                    } else {
                        System.out.println("Nomor item tidak valid. Harap masukkan nomor antara 1 dan " + restaurant.getMenuSize() + ".");
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Input tidak valid. Harap masukkan nomor item yang benar atau '0' untuk selesai.");
                }
            }
        }
        restaurant.displaySales(); // Menampilkan pesanan setelah keluar dari loop
        scanner.close();
    }
}
