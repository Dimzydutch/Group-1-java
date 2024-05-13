import java.util.Scanner;

// Shape class
class Shape {
    public double calculateArea() {
        return 0;
    }

    public double calculateVolume() {
        return 0;
    }
}

// Triangle subclass
class Triangle extends Shape {
    private double base;
    private double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return 0.5 * base * height;
    }
}

// Circle subclass
class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

// Rectangle subclass
class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double calculateArea() {
        return length * width;
    }
}

// Sphere subclass
class Sphere extends Shape {
    private double radius;

    public Sphere(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return 4 * Math.PI * radius * radius;
    }

    @Override
    public double calculateVolume() {
        return (4.0 / 3) * Math.PI * Math.pow(radius, 3);
    }
}

// Cube subclass
class Cube extends Shape {
    private double side;

    public Cube(double side) {
        this.side = side;
    }

    @Override
    public double calculateArea() {
        return 6 * side * side;
    }

    @Override
    public double calculateVolume() {
        return Math.pow(side, 3);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

            System.out.println("Select a shape:");
            System.out.println("1. Triangle");
            System.out.println("2. Circle");
            System.out.println("3. Rectangle");
            System.out.println("4. Sphere");
            System.out.println("5. Cube");
            System.out.println("6. Exit");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter base of the triangle: ");
                    double base = scanner.nextDouble();
                    System.out.print("Enter height of the triangle: ");
                    double height = scanner.nextDouble();
                    Triangle triangle = new Triangle(base, height);
                    System.out.println("Area of the triangle: " + triangle.calculateArea());
                    break;
                case 2:
                    System.out.print("Enter radius of the circle: ");
                    double radius = scanner.nextDouble();
                    Circle circle = new Circle(radius);
                    System.out.println("Area of the circle: " + circle.calculateArea());
                    break;
                case 3:
                    System.out.print("Enter length of the rectangle: ");
                    double length = scanner.nextDouble();
                    System.out.print("Enter width of the rectangle: ");
                    double width = scanner.nextDouble();
                    Rectangle rectangle = new Rectangle(length, width);
                    System.out.println("Area of the rectangle: " + rectangle.calculateArea());
                    break;
                case 4:
                    System.out.print("Enter radius of the sphere: ");
                    double sphereRadius = scanner.nextDouble();
                    Sphere sphere = new Sphere(sphereRadius);
                    System.out.println("Area of the sphere: " + sphere.calculateArea());
                    System.out.println("Volume of the sphere: " + sphere.calculateVolume());
                    break;
                case 5:
                    System.out.print("Enter side length of the cube: ");
                    double side = scanner.nextDouble();
                    Cube cube = new Cube(side);
                    System.out.println("Area of the cube: " + cube.calculateArea());
                    System.out.println("Volume of the cube: " + cube.calculateVolume());
                    break;
                case 6:
                    System.out.println("Exiting program...");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 6.");
            }
        
        scanner.close();
    }
}