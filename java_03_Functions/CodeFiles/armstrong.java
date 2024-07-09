package java_03_Functions.CodeFiles;

import java.util.Scanner;

public class armstrong {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // int n = scan.nextInt();
        // System.out.println(isArmstrong(n));
        for(int i = 100; i<1000; i++){
            if(isArmstrong(i)){
                System.out.println(i + " ");
            }
        }
        scan.close();
    }

    static boolean isArmstrong(int n){
        int original = n;
        int sum = 0;
        while (n>0) {
            int rem = n % 10;
            n = n / 10;
            sum = sum + rem*rem*rem;
        }
        return sum == original;
    }

}
