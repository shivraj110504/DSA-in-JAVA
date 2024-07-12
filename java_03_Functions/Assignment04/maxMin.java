package java_03_Functions.Assignment04;

import java.util.Scanner;

// 01 Define two methods to print the maximum and the minimum number respectively among three numbers entered by the user.

public class maxMin {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter three numbers ");
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        scan.close();
        max(a, b, c);
    }

    static void max(int a, int b, int c){
        if (a > b && a>c) {
            System.out.println(a + " is greater");
        }else if (a<b && b > c) {
            System.out.println(b + " is greater");
        }else{
            System.out.println(c + " is greater");
        }

    }
}
