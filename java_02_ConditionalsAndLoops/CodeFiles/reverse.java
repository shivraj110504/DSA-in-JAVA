package java_02_ConditionalsAndLoops.CodeFiles;

import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {
        
        //reverse the value
        Scanner scan = new Scanner(System.in);
        System.out.println("enetr the number");
         int n= scan.nextInt();
         scan.close();
         int ans = 0;
         while (n>0) {
            int rem = n%10;
             n = n / 10;
            
             ans = ans *10 + rem;
         }
         System.out.println(ans);
    }
}
