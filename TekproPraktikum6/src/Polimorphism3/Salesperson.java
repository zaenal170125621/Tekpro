package Polimorphism3;

public class Salesperson implements Comparable {
    private String firstName, lastName;
    private int totalSales;

    // -----------------------------------------
    // Constructor: Sets up the salesperson object with the given data.
    // -----------------------------------------
    public Salesperson(String first, String last, int sales) {
        firstName = first;
        lastName = last;
        totalSales = sales;
    }

    // -----------------------------------------
    // Returns the salesperson as a string.
    // -----------------------------------------
    public String toString() {
        return lastName + ", " + firstName + ": \t" + totalSales;
    }

    // -----------------------------------------
    // Returns true if the salespeople have
    // the same name.
    // -----------------------------------------
    public boolean equals(Object other) {
        return (lastName.equals(((Salesperson) other).getLastName()) &&
                firstName.equals(((Salesperson) other).getFirstName()));
    }

    // -----------------------------------------
    // Order is based on total sales with the name
    // (last, then first) breaking a tie.
    // -----------------------------------------
    public int compareTo(Object other) {
        int otherSales = ((Salesperson) other).getTotalSales();

        if (totalSales != otherSales) {
            return totalSales - otherSales;
        }
        return lastName.compareTo(((Salesperson) other).getLastName());
    }

    // -----------------------------------------
    // First name accessor.
    // -----------------------------------------
    public String getFirstName() {
        return firstName;
    }

    // -----------------------------------------
    // Last name accessor.
    // -----------------------------------------
    public String getLastName() {
        return lastName;
    }

    // -----------------------------------------
    // Total sales accessor.
    // -----------------------------------------
    public int getTotalSales() {
        return totalSales;
    }

}
