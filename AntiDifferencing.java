import java.util.Scanner;


public class AntiDifferencing {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter the starting value of m: ");
        int startM = scanner.nextInt();


        System.out.print("Enter the ending value of m: ");
        int endM = scanner.nextInt();


        for (int m = startM; m <= endM; m++) {
            System.out.println("m = " + m + ": " + antiDifference(5, m));
        }


        scanner.close();
    }
    // Function to calculate anti-difference of x^-m
    public static double antiDifference(double x, int m) {
        if (m == 0) {
            return Math.log(x); // Anti-difference of x^0 is ln(x)
        } else {
            return (Math.pow(x, (1 - m)) / (1 - m)); // Anti-difference of x^-m is x^(1-m) / (1 - m)
        }
    }
}
