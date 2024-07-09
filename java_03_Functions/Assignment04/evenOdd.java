package java_03_Functions.Assignment04;

import java.util.Scanner;

//02 Define a program to find out whether a given number is even or odd.

public class evenOdd {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number :");
        int num = scan.nextInt();
        scan.close();
        even(num);
    }

    static void even(int num){
        if (num % 2 ==0 ) {
            System.out.println("Even");
        }else{
            System.out.println("Odd");
        }
    }

}
