import java.util.Scanner;

public class Main {
    private static Scanner sc = new Scanner(System.in);

    public static void solveQuadraticEquation(double a, double b, double c) {
        // calculate delta
        double delta = b * b - 4 * a * c;
        if (delta < 0) {
            System.out.print("Phương trình " + a + ("x^2 + " + b + "+ x " + c + " vô nghiệm."));
        } else if (delta == 0) {
            System.out.print("Phương trình " + a + ("x^2 + " + b + "+ x " + c + " có nghiệm kép."));
            System.out.println("Nghiệm của phương trình là:" + (b / (2 * a)));

        } else {
            System.out.print("Phương trình " + a + ("x^2 " + b + "x " + c + " có 2 nghiệm phân biệt."));
            System.out.println("Nghiệm thứ nhất của phương trình là:" + ((b + Math.sqrt(delta)) / (2 * a)));
            System.out.println("Nghiệm thứ hai của phương trình là:" + ((b + Math.sqrt(delta)) / (2 * a)));

        }
    }

    public static void main(String[] args) {
        solveQuadraticEquation(1, 2, 3);
    }
}