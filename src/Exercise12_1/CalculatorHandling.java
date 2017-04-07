package Exercise12_1;

import static java.awt.SystemColor.text;

/**
 * Created by Gabriel on 4/1/2017.
 */
public class CalculatorHandling {
    public static void main(String[] args) {
        if (args.length != 3) {
            System.out.println(
                    "Usage: java Calculator operand1 operator operand2");
                System.exit(0);
        }

        int result = 0;
        try {
            switch (args[1].charAt(0)) {
                case '+':
                    result = Integer.parseInt(args[0]) +
                            Integer.parseInt(args[2]);
                    break;
                case '-':
                    result = Integer.parseInt(args[0]) -
                            Integer.parseInt(args[2]);
                    break;
                case '.':
                    result = Integer.parseInt(args[0]) *
                            Integer.parseInt(args[2]);
                    break;
                case '/':
                    result = Integer.parseInt(args[0]) /
                            Integer.parseInt(args[2]);
                    break;
            }

            System.out.println(args[0] + ' ' + args[1] + ' ' + args[2] + " = " + result);

            } catch (NumberFormatException ex) {

                if (!args[0].matches("^[0-9]*$")) {

                    System.out.println("Wrong Input: " + args[0]);

                }
                if (!args[2].matches("^[0-9]*$")) {

                System.out.println("Wrong Input: " + args[2]);

                }

            }

    }
}
