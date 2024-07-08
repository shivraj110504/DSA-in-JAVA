package java_02_ConditionalsAndLoops.Assignment03;

// 02 calculate Electicity bill

import java.util.Scanner;

public class electricBill {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Your daily usage in Wats (24 hr usage)");
        float n = scan.nextFloat();
        System.out.println("Rate : ");
        float m = scan.nextFloat();
        System.out.println("No. of days you want to calculate: ");
        float d = scan.nextFloat();
        scan.close();

        float electricity = n /1000;
        electricity = electricity * m * d;

        System.out.println("Your ammout is " + electricity);
    }
}
