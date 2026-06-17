import java.util.Scanner;

public class IT26100090Lab9Q2 {

    
    public static double circleArea(double radius) {
        
        double area = Math.PI * radius * radius;
        return area;
    }

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(scanner.in);

        
        System.out.print("Enter the radius of the circle: ");
        double radius = scanner.nextDouble();

        
        double area = circleArea(radius);

        
        System.out.println("The area of the circle with radius " + radius + " is : " + area);

        
        scanner.close();
    }
}