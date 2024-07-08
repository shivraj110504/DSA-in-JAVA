package java_02_ConditionalsAndLoops.Assignment03;

// 01 Factorial program in java

import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number :");
        int n = scan.nextInt();
        scan.close();
        int f =1;
        for(int i=1; i<=n; i++){
           f= f*i;
        }
        System.out.println(f);
    }
}
