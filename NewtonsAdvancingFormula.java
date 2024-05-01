import java.util.Scanner;
public class NewtonsAdvancingFormula {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Getting user input for initial values of x, y, and h
        System.out.print("Enter the initial value of x: ");
        double x0 = scanner.nextDouble();


        System.out.print("Enter the initial value of y: ");
        double y0 = scanner.nextDouble();


        System.out.print("Enter the step size h: ");
        double h = scanner.nextDouble();


        // Using Newton's Advancing Formula to calculate next x and y
        double nextX = x0 + h;
        double nextY = y0 + h * functionDerivative(x0, y0);


        // Printing the next values of x and y
        System.out.println("Next value of x: " + nextX);
        System.out.println("Next value of y: " + nextY);
        scanner.close();
    }
   // Example function derivative, replace with your function's derivative
    public static double functionDerivative(double x, double y) {
        // Example function: y' = 2xy
        return 2 * x * y;
    }
}
