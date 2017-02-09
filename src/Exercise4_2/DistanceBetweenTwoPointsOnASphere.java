package Exercise4_2;

import java.util.Scanner;

/*
d = radius * arccos(sin(x1) * sin(x2) + cos(x1) * cos(x2) * cos(y1 - y2))
Write 2 points in degree > convert the degrees to radian > input value in the formula
 */
public class DistanceBetweenTwoPointsOnASphere {
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);
        double radius = 6371.01;

        System.out.println("Enter point 1 (Latitude and Longitude) in degrees: ");
        double x1 = input.nextDouble();
        x1 = Math.toRadians(x1);
        double y1 = input.nextDouble();
        y1 = Math.toRadians(y1);
        System.out.println("Enter point 2 (Latitude and Longitude) in degrees: ");
        double x2 = input.nextDouble();
        x2 = Math.toRadians(x2);
        double y2 = input.nextDouble();
        y2 = Math.toRadians(y2);
        System.out.print("The distance between 2 points is " + Distance2Points(x1, y1, x2, y2, radius) + " km");
    }

    public static double Distance2Points(double x1, double y1, double x2, double y2, double radius) {
        double total = 0;
        total = radius * Math.acos( (Math.sin(x1) * Math.sin(x2)) + (Math.cos(x1) * Math.cos(x2) * Math.cos(y1 - y2)) );
        return total;
    }
}