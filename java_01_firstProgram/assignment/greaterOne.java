package java_01_firstProgram.assignment;

import java.util.Scanner;

public class greaterOne {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number");
        int a = scan.nextInt();
        System.out.println("Enter another number");
        int b = scan.nextInt();
        scan.close();
        if (a>b){
            System.out.println("first number is greater than second");
        }else{
            System.out.println("second number is greater than first");
        }

    }
}
