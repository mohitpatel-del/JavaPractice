package Circle;

import java.util.Scanner;

public class UseCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r;
        System.out.println("Enter Radius of the Circle:");
        r = sc.nextInt();
        Circle obj1 = new Circle(r);
        System.out.println("Area of Circle =  "+ obj1.calcArea());
        System.out.println();
        System.out.println("Circumference of Circle = "+ obj1.calcCircumference());
    }
}
