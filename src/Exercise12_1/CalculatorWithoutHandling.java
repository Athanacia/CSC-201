package Exercise12_1;

/**
 * Created by Gabriel on 4/6/2017.
 */
public class CalculatorWithoutHandling {
    public static void main(String[] args) {
        if (args.length != 3) {
            System.out.println(
                    "Usage: java Calculator operand1 operator operand2");
            System.exit(0);
        }

        int result = 0;
        if (args[0].matches("^[0-9]*?") && args[2].matches("^[0-9]*?")) {
            switch (args[1].charAt(0)) {
                case '+':
                    result = Integer.parseInt(args[0]) +
                            Integer.parseInt(args[2]);
                    System.out.println(args[0] + ' ' + args[1] + ' ' + args[2] + " = " + result);
                    break;
                case '-':
                    result = Integer.parseInt(args[0]) -
                            Integer.parseInt(args[2]);
                    System.out.println(args[0] + ' ' + args[1] + ' ' + args[2] + " = " + result);
                    break;
                case '.':
                    result = Integer.parseInt(args[0]) *
                            Integer.parseInt(args[2]);
                    System.out.println(args[0] + ' ' + args[1] + ' ' + args[2] + " = " + result);
                    break;
                case '/':
                    result = Integer.parseInt(args[0]) /
                            Integer.parseInt(args[2]);
                    System.out.println(args[0] + ' ' + args[1] + ' ' + args[2] + " = " + result);
                    break;
            }
        } else if (!args[0].matches("^[0-9]*?")) {
            System.out.println("Wrong input: " + args[0]);
        } else if (!args[2].matches("^[0-9]*?")) {
            System.out.println("Wrong input: " + args[2]);
        }
    }
}