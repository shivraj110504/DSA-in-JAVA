package java_01_firstProgram.assignment;

import java.util.Scanner;

public class evenOdd {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = scan.nextInt();
        scan.close();
        if (n % 2 == 0) {
            System.out.println("Number is even !");
        }else{
            System.out.println("Number is odd ");
        }
    }
}
