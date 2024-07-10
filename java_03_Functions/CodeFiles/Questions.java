package java_03_Functions.CodeFiles;

import java.util.Scanner;

public class Questions {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        System.out.println(isPrime(n));
        scan.close();
    }

    static boolean isPrime (int n){
        if (n<=1) {
            return false;
        }
        int c = 2;
        while (c * c <= n) {
            if (n % c == 0) {
                return false;
            }
            c++;
        }
        return c * c > n;
       
    }
}
