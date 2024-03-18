package Polimorphism2;

import java.text.DecimalFormat;

public class PaintThings {
    public static void main(String args[]) {
        final double COVERAGE=350;
        Paint paint=new Paint(COVERAGE);

        Rectangle deck=new Rectangle(101, 125);
        Sphere bigBall=new Sphere(205);
        Cylinder tank=new Cylinder(105, 300);

        double deckAmt, ballAmt, tankAmt;
        deckAmt=paint.amount(deck);
        ballAmt=paint.amount(bigBall);
        tankAmt=paint.amount(tank);

        DecimalFormat fmt = new DecimalFormat("0.#");
        System.out.println("\nNumber of gallons of paint needed...");
        System.out.println("Deck " + fmt.format(deckAmt));
        System.out.println("Ball " + fmt.format(ballAmt));
        System.out.println("Tank " + fmt.format(tankAmt));
    }
}