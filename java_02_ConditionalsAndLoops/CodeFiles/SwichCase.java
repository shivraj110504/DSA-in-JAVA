package java_02_ConditionalsAndLoops;

import java.util.Scanner;

public class SwichCase {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String fruit = scan.next();

        switch (fruit) {
            case "mango":
                System.out.println("king of fruit");
                break;
            
            case "apple":
            System.out.println("sweet and red");
            break;

            case "orange":
            System.out.println("round fruit");
            break;

        
            default:
            System.out.println("please entre valid fruit");
                break;
        }

    }
}
