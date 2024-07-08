package java_02_ConditionalsAndLoops.Assignment03;

import java.util.Scanner;

public class average {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the number");
        int n = scan.nextInt();
        scan.close();
        int sum = 0;
        while (n>0) {
             int rem = n % 10; 
             n = n / 10;
             sum = sum + rem;
            
            //  int rem = n%10;
            //  n = n / 10;
            
            //  ans = ans + rem;
             
        }System.out.println(sum);
    }
}
