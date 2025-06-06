import java.util.Scanner;
public class Triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first side: ");
        double a = sc.nextDouble();
        System.out.print("Enter second side: ");
        double b = sc.nextDouble();
        System.out.print("Enter third side: ");
        double c = sc.nextDouble();
        double perimeter = a + b + c;
        double s = perimeter / 2;
        double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
        System.out.println("Perimeter of the triangle: " + perimeter);
        System.out.println("Area of the triangle: " + area);
        sc.close();
    }
}
