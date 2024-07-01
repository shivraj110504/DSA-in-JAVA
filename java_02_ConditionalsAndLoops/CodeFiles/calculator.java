package java_02_ConditionalsAndLoops.CodeFiles;

import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
         //calculator
         int ans = 0;
         while (true) { 
             System.out.println("Enter the operator :");
             char op = scan.next().trim().charAt(0);
             if (op =='+'|| op=='-'|| op == '*'|| op == '/' || op == '%') {
              System.out.println("Enter two numbers :");
                 int n = scan.nextInt();
                 int m = scan.nextInt();
                scan.close();
                 if (op == '+') {
                      ans = m + n;
                 }
                 if (op == '-') {
                     ans = n - m;
                }
                if (op == '*') {
                 ans = m * n;
                  }
                  if (op == '/') {
                     if (m!=0) {
                         ans = n /m;
                     }       
                }if (op == '%') {
                 ans = n % m;
            }else if (op == 'x' || op == 'X') {
             break;
            }else{
             System.out.println("invalid Operation");
            }
                 
             }System.out.println(ans);
               
         }
         
    }
}
