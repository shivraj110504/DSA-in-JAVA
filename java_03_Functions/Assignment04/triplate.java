package java_03_Functions.Assignment04;

import java.util.Scanner;

//Write a function to check if a given triplet is a Pythagorean triplet or not. (A Pythagorean triplet is when the sum of the square of two numbers is equal to the square of the third number).

public class triplate {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter three numbers : ");
        int a=scan.nextInt();
        int b=scan.nextInt();
        int c=scan.nextInt();
        scan.close();
        triple(a, b, c);
    }
    static void triple(int a, int b, int c){
        if (a*a+b*b==c*c) {
            System.out.println("It is Pythagorian Triplate");
        }else if (a*a+b*b!=c*c) {
            System.out.println("Not a triplate");
            System.out.println("Please enter correct triplate (sequential)");
        }else{
            System.out.println("Please enter correct triplate (sequential)");
        }
    }
}
