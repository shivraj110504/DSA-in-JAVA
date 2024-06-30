package java_01_firstProgram.assignment;

import java.util.Scanner;

public class greetingMSG {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the name :");
        String str = scan.nextLine();
        scan.close();
        System.out.println("Hello " + str);
    }
}
