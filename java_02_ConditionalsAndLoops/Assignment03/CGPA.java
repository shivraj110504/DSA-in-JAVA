package java_02_ConditionalsAndLoops.Assignment03;

// 10 calculate CGPA using java

import java.util.Scanner;

public class CGPA {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         //CGPA Calculator 
        System.out.println("Enter the marks of 1st subject :");
        int a = scanner.nextInt();
        System.out.println("Enter the marks of of 2nd subject:");
        int b = scanner.nextInt();
        System.out.println("Enter the marks of 3rd subject:");
        int c = scanner.nextInt();
        System.out.println("Enter the marks of of 4th subject:");
        int d = scanner.nextInt();
        System.out.println("Enter the marks of 5th subject:");
        int e = scanner.nextInt();
        scanner.close();

        float sum = a + b + c + d + e;
        float per = sum / 50;
        System.out.printf("Your CGPA is %f:",per);
        System.out.println("\n");
    }
}
