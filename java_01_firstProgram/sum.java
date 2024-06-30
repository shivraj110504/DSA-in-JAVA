package java_01_firstProgram;
import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number ");
        int a = scan.nextInt();
        System.out.println("Enter another number");
        int b = scan.nextInt();
        scan.close();
        int sum = a + b;
        System.out.println(sum);

    }
}
