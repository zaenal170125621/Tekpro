package Polimorphism1;

public class Commission extends Hourly { //Extends from Hourly
    private double totalSales;
    private double commissionRate;
    //Constructor
    // Take 6 parameters
    public Commission(String eName, String eAddress, String ePhone, String socSecNumber, double rate, double commissionRate){
        super(eName, eAddress, ePhone, socSecNumber, rate);
        this.commissionRate = commissionRate;
    }
    public void addSales(double totalSales){
        this.totalSales = totalSales;
    }
    public double pay(){
        double payment = super.pay()+ totalSales*(1.0 + commissionRate);
        totalSales = 0;
        return payment;
    }
    public String toString(){
        String result = super.toString();
        result += "\nTotal Sales : " + totalSales;

        return result;
    }
}