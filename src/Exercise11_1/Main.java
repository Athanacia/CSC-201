package Exercise11_1;

import java.util.Scanner;

/**
 * Created by Sabrewulf on 3/21/2017.
 */
public class Main {
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the first side:");
        double sideUno = input.nextDouble();
        System.out.println("Enter the second side:");
        double sideDos = input.nextDouble();
        System.out.println("Enter the third side:");
        double sideTres = input.nextDouble();
        System.out.println("Enter a color:");
        String colorChoice = input.next();
        System.out.println("Do you want filled? Enter true or false:");
        boolean filledChoice = input.nextBoolean();
        System.out.println();

        Triangle triangle = new Triangle(sideUno, sideDos, sideTres, colorChoice, filledChoice);

        System.out.println("The triangle properties: " +
                            "\narea = " + triangle.getArea() +
                            "\nPerimeter = " + triangle.getPerimeter() +
                            "\nColor = " + triangle.getColor() +
                            "\nFilled = " + triangle.isFilled());
    }
}
