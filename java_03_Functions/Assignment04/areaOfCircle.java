package java_03_Functions.Assignment04;

import java.util.Scanner;

// 06 Write a program to print the circumference and area of a circle of radius entered by user by defining your own method.

public class areaOfCircle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the radius :");
        float a = scan.nextInt();
        scan.close();
        area(a);

    }
    static void area(float a){
        float area = 3.14f * a *a;
        float circ  = 2 * 3.14f * a;
        System.out.println("Area of circle is :" + area);
        System.out.println("Circumferance of circle is :" + circ);
    }
}
