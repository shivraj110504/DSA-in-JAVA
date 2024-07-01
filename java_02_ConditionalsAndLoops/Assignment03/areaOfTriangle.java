package java_02_ConditionalsAndLoops.Assignment03;

import java.util.Scanner;

public class areaOfTriangle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the side of triangle");
        int side = scan.nextInt();
        System.out.println("Enter height of triangle");
        int height  = scan.nextInt();
        scan.close();
        int area = (side * height)/2 ;
        System.out.println("Area of triangle is " + area);
    }
}
