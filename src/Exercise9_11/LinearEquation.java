package Exercise9_11;

import java.util.Scanner;

/**
 * Created by Gabriel on 2/19/2017.
 */
public class LinearEquation {
    private double a;
    private double b;
    private double c;
    private double d;
    private double e;
    private double f;

    LinearEquation() {

    }

    private LinearEquation(double a, double b, double c, double d, double e, double f) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }

    private boolean isSolvable() {
        double equation = (this.a * this.d) - (this.b * this.c);
        if (equation == 0) {
            return false;
        }
        return true;
    }
    public double getX() {
        return ((this.e * this.d) - (this.b * this.f) / (this.a * this.d) - (this.b * this.c));
    }
    public double getY() {
        return ((this.a * this.f) - (this.e * this.c)) / ((this.a * this.d) - (this.b * this.c));
    }

    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the next values in the next order a, b, c, d, e, f:");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        double d = input.nextDouble();
        double e = input.nextDouble();
        double f = input.nextDouble();
        LinearEquation equation = new LinearEquation(a, b, c, d, e, f);
        if (equation.isSolvable()) {
            System.out.println("The equation has solution");
        } else {
            System.out.println("The equation has no solution");
        }
    }
}
