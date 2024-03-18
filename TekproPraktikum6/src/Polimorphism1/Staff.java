package Polimorphism1;

import Polimorphism1.Employee;
import Polimorphism1.Executive;

public class Staff {
    StaffMember[] staffList;

    public Staff() {
        staffList = new StaffMember[7];

        staffList[0] = new Executive("Sam", "123 Main Line", "555-0101", "123-45-6789", 2423.07);

        staffList[1] = new Employee("Carla", "456 off Line", "555-0101", "987-65-4321", 1246.15);

        staffList[2] = new Employee("Woody", "789 off Rocker", "555-0000", "010-20-3040", 1169.23);

        staffList[3] = new Hourly("Diane", "678 Fifth Ave.", "555-0690", "958-47-3625", 10.55);

        staffList[4] = new Volunteer("Norm", "987 Suds Blvd.", "555-8374");

        staffList[5] = new Volunteer("Cliff", "321 Duds Lane", "555-7282");

        staffList[6] = new Commission("zaenal", "122 on Rocker", "555-3211", "010-20-3040", 321.43, .3);

        ((Executive)staffList[0]).awardBonus (500.000);
        ((Hourly)staffList[3]).addHours (40);

        ((Commission)staffList[6]).addHours(45);
        ((Commission)staffList[6]).addSales(1000);
    }
    //PAY ALL STAFF MEMBERS
    public void payday(){
        double amount;

        for(int count=0; count < staffList.length;count++){
            System.out.println(staffList[count]);

            amount=staffList[count].pay();  //POLIMORPHIC

            if(amount==0.0){
                System.out.println("Thanks!");
                System.out.println("----------------------------------------------------------");
            } else {
                System.out.println("Paid: " + amount);
                System.out.println("----------------------------------------------------------");
            }
        }
    }
}
