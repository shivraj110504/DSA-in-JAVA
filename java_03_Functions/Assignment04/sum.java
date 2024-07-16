package java_03_Functions.Assignment04;

import java.util.Scanner;

//Write a function that returns the sum of first n natural numbers.

public class sum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the num :");
        int n = scan.nextInt();
        scan.close();
        add(n);
    }
    static void add(int n){
        int sum = 0;
        for(int i=1; i<=n;i++){
            sum = sum + i;
        }System.out.println(sum);
    }
}
