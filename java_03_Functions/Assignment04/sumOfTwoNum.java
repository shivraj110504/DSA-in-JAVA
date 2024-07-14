package java_03_Functions.Assignment04;

import java.util.Scanner;

// 04 Write a program to print the sum of two numbers entered by user by defining your own method.

public class sumOfTwoNum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the first number :");
        int a = scan.nextInt();
        System.out.println("Enter the second number :");
        int b = scan.nextInt();
        scan.close();
        add(a, b);

    }

    static void add(int a,int b){
        int sum = a + b;
        System.out.println(sum);
    }

}
