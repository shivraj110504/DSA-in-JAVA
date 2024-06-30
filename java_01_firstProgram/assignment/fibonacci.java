package java_01_firstProgram.assignment;

import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = 0;
        int b = 1;
        int nextTerm = a+b;
        scan.close();

        System.out.println("enter the number of terms you want to print");
        int n = scan.nextInt();
        System.out.printf("%d, %d",a,b);
        System.out.println(" ");
        for (int i = 3; i<=n; ++i){
            System.out.println(nextTerm);
            a=b;
            b=nextTerm;
            nextTerm= a + b;
        }
    }
}
