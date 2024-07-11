package java_03_Functions.Assignment04;

import java.util.Scanner;

//03  A person is eligible to vote if his/her age is greater than or equal to 18. Define a method to find out if he/she is eligible to vote.

public class voterEligiblity {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your age :");
        int age = scan.nextInt();
        scan.close();
        voter(age);

    }

    static void voter(int age){
        if (age >= 18) {
            System.out.println("You can Vote ");
        }
        else{
            System.out.println("You can not Vote ");
        }
    }

}
