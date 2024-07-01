package java_02_ConditionalsAndLoops.CodeFiles;

import java.util.Scanner;

public class repeate {
    public static void main(String[] args) {
        
        //repeated number checker -> Count
        Scanner scan = new Scanner(System.in);
         
         System.out.println("Enetr the number");
         int n= scan.nextInt();
         System.out.println("Enter degit you want to check");
         int m = scan.nextInt();
         scan.close();
         int count = 0;
         while (n>0) {
            int rem = n%10;
            if (rem == m) {
                count++;
            }
            n = n/10;
         }
         System.out.println(count);
    }
}
