import java.util.Scanner;

class Calculator {
    public double calculate(double a, double b, String operation) {
        switch (operation.toLowerCase()) {
            case "add":
                return a + b;
            case "sub":
                return a - b;
            case "mul":
                return a * b;
            case "div":
                if (b == 0) {
                    System.out.println("Division by zero is not allowed.");
                    return 0;
                }
                return a / b;
            default:
                System.out.println("Invalid operation type.");
                return 0;
        }
    }
}

public class Problem_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value of a: ");
        double a = sc.nextDouble();

        System.out.print("Enter value of b: ");
        double b = sc.nextDouble();

        System.out.print("Enter operation (add / sub / mul / div): ");
        String operation = sc.next();

        Calculator calc = new Calculator();
        double result = calc.calculate(a, b, operation);

        System.out.println("Result: " + result);
        sc.close();
    }
}
