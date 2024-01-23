//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) { // ["3", "+", "2"] ["4", "+", "2", "-", "1"]
        System.out.println("Symple calculette :");
        simpleCalculette(args);

        System.out.println("Complex calculette :");
        complexCalculette(args);
    }

    public static void complexCalculette(String[] args) {
        double result = Double.parseDouble(args[0]);;
        for (int i = 0; i+2 < args.length; i += 2) {
            double left = result;
            char operator = args[i+1].charAt(0);
            double right = Double.parseDouble(args[i+2]);
            result = compute(left, right, operator);
        }
        System.out.println(result);
    }

    public static void simpleCalculette(String[] args) {
        double left = Double.parseDouble(args[0]);
        char operator = args[1].charAt(0);
        double right = Double.parseDouble(args[2]);

        double result = compute(left, right, operator);
        System.out.println(result);
    }

    public static double compute(double left, double right, char operator) {
        return switch (operator) {
            case '+' -> left + right;
            case '-' -> left - right;
            case '*' -> left * right;
            case '/' -> left / right;
            default -> throw new IllegalArgumentException("Operator " + operator + " is not recognized");
        };
    }
}