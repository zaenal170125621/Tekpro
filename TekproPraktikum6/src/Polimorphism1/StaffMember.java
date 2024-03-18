package Polimorphism1;

abstract public class StaffMember {
    protected String name;
    protected String address;
    protected String phone;

    //SET UP A STAFF MEMBER USING THE SPECIFIED INFORMATION
    public StaffMember(String eName, String eAddress, String ePhone){
        name=eName;
        address=eAddress;
        phone=ePhone;
    }

    //Return a string including the basic employee information
    public String toString() {
        String result = "Name: " + name + "\n";
        result += "Address: " + address + "\n";
        result += "Phone: " + phone + "\n";

        return result;
    }
        //Derived classes must define the pay methid for each type of employee
    public abstract double pay();

}