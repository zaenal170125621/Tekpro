package Polimorphism2;

public class Sphere extends Shape{
    private double radius; //radius in feet

    //------------------------------------
    // Contructor: Sets up the Sphere
    //------------------------------------
    public Sphere(double r) {
        super("Sphere");
        radius=r;
    }

    //------------------------------------
    // Returns the surface area of the sphere.
    //------------------------------------
    public double area() {
        return 4*Math.PI*radius*radius;
    }

    //------------------------------------
    // Returns the sphere as a String.
    //------------------------------------
    public String toString() {
        return super.toString() + " of radius " + radius;
    }
}