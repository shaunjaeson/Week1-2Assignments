import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input
        System.out.print("Enter base (cm): ");
        double base = input.nextDouble();
        System.out.print("Enter height (cm): ");
        double height = input.nextDouble();

        // Calculation in sq cm
        double areaCm = 0.5 * base * height;

        // Conversion to sq inches (1 sq in = 2.54 * 2.54 sq cm)
        double areaInches = areaCm / (2.54 * 2.54);

        // Output
        System.out.printf("The Area of the triangle in sq in is %.2f and sq cm is %.2f%n", areaInches, areaCm);
        
        input.close();
    }
}