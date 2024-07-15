package java_03_Functions.Assignment04;

import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number :");
        int n = scan.nextInt();
        scan.close();
        ract(n);

    }
    static void ract(int n){
        int fact = 1;
        if (n==0) {
            System.out.println("1");
        }else if (n==1) {
            System.out.println("1");
        }else{
            for(int i=n; i>0; i--){
            fact = fact * i;      
        }System.out.println(fact);
        }
        
    }
}
