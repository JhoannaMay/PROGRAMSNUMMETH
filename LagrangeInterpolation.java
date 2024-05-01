import java.util.function.Function;


public class LagrangeInterpolation {


    // Central difference method for Lagrange interpolation
    public static double centralDifference(Function<Double, Double> function, double x, double h) {
        return (function.apply(x + h) - function.apply(x - h)) / (2 * h);
    }


    // Forward difference method for Lagrange interpolation
    public static double forwardDifference(Function<Double, Double> function, double x, double h) {
        return (function.apply(x + h) - function.apply(x)) / h;
    }


    // Backward difference method for Lagrange interpolation
    public static double backwardDifference(Function<Double, Double> function, double x, double h) {
        return (function.apply(x) - function.apply(x - h)) / h;
    }


   public static void main(String[] args) {
        // Example function: f(x) = x^2
        Function<Double, Double> function = x -> x * x;
        double x = 2.0; // Point at which to approximate the derivative
        double h = 0.01; // Step size
        // Compute derivatives using different Lagrange interpolation methods
        double centralDerivative = centralDifference(function, x, h);
        double forwardDerivative = forwardDifference(function, x, h);
        double backwardDerivative = backwardDifference(function, x, h);
        // Print results
        System.out.println("Central Difference Method: " + centralDerivative);
        System.out.println("Forward Difference Method: " + forwardDerivative);
        System.out.println("Backward Difference Method: " + backwardDerivative);
    }
}
