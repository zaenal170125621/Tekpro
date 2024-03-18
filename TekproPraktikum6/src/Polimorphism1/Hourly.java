package Polimorphism1;

public class Hourly extends Employee{
    private int hoursWorked;

    //--------------------------------------------------------
    //  Sets up this hourly employee using the specified information.
    //--------------------------------------------------------
    public Hourly(String eName, String eAddress, String ePhone,
                  String socSecNumber, double rate)
    {
        super(eName,eAddress,ePhone,socSecNumber,rate);

        hoursWorked = 0;  // bonus has yet to be awarded
    }

    //--------------------------------------------------------
    //  Adds the specified number of hours to this employee's
    //  accumulated hours.
    //--------------------------------------------------------
    public void addHours(int moreHours)
    {
        hoursWorked += moreHours;
    }

    //--------------------------------------------------------
    //  Computes and returns the pay for this hourly employee.
    //--------------------------------------------------------
    @Override
    public double pay()
    {
        double payment = payRate * hoursWorked;

        hoursWorked = 0;

        return payment;
    }

    //--------------------------------------------------------
    //  Returns information about this hourly employee as a string.
    //--------------------------------------------------------
    @Override
    public String toString()
    {
        String result = super.toString();

        result += "\nCurrent Hours: " + hoursWorked;

        return result;
    }
}
