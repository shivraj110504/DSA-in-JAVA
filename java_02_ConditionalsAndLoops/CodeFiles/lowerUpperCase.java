package java_02_ConditionalsAndLoops.CodeFiles;

import java.util.Scanner;

public class lowerUpperCase {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Letter :");
        char ch = scan.next().trim().charAt(0);
        scan.close();
            if (ch >= 'a' && ch<='z') {
                System.out.println("Lowercase");
            }else{
                System.out.println("uppeercase");
            }
    }
}
