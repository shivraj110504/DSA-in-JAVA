package java_03_Functions.Assignment04;

import java.util.Scanner;

// 05 Define a method that returns the product of two numbers entered by user.

public class product {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number1 :");
        int a = scan.nextInt();
        System.out.println("Enter the number2 :");
        int b = scan.nextInt();
        scan.close();
        Prod(a, b);

    }
    static void Prod(int a,int b){
        int product = a * b;
        System.out.println(product);
    }
}
