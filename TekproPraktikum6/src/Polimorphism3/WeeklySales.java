package Polimorphism3;

import java.util.Scanner;

public class WeeklySales {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        Salesperson[] salesStaff = new Salesperson[10];

        System.out.println("Enter salesperson details (first name, last name, total sales) for 10 salespeople:");

        for (int i = 0; i < 10; i++) {
            System.out.println("Salesperson " + (i + 1) + ":");
            System.out.print("First Name: ");
            String firstName = scan.next();
            System.out.print("Last Name: ");
            String lastName = scan.nextLine(); // Consume newline character
            lastName = scan.nextLine(); // Read last name
            System.out.print("Total Sales: ");
            int totalSales = scan.nextInt();

            salesStaff[i] = new Salesperson(firstName, lastName, totalSales);
        }

        Sorting.insertionSort(salesStaff);

        System.out.println("\nRanking of Sales for the Week");

        for (Salesperson s : salesStaff)
            System.out.println(s);
    }
}

/*
import java.util.Scanner;

public class WeeklySales {
	private static Salesperson[] salesStaff;

	public static void main(String args[]) {
		Salesperson[] salesStaff=new Salesperson[10];

		salesStaff[0]= new Salesperson ("Jane", "Jones", 3000);
		salesStaff[1]= new Salesperson ("Daffy", "Duck", 4935);
		salesStaff[2]= new Salesperson ("James", "Jones", 3000);
		salesStaff[3]= new Salesperson ("Dick", "Walter", 2800);
		salesStaff[4]= new Salesperson ("Don", "Trump", 1570);
		salesStaff[5]= new Salesperson ("Jane", "Black", 3000);
		salesStaff[6]= new Salesperson ("Harry", "Taylor", 7300);
		salesStaff[7]= new Salesperson ("Andy", "Adams", 5000);
		salesStaff[8]= new Salesperson ("Jim", "Doe", 2850);
		salesStaff[9]= new Salesperson ("Walt", "Smith", 3000);

		Sorting.insertionSort(salesStaff);

		System.out.println("\nRanking of Sales for the Week");

		for (Salesperson s: salesStaff)
			System.out.println(s);
	}
}
*/
