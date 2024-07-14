/*Write a program that will ask the user to enter his/her marks (out of 100). Define a method that will display grades according to the marks entered as below:
Marks        Grade 
91-100         AA 
81-90          AB 
71-80          BB 
61-70          BC 
51-60          CD 
41-50          DD 
<=40          Fail */
package java_03_Functions.Assignment04;

import java.util.Scanner;

public class gradeFinder {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your marks (outoff 100)");
        int a = scan.nextInt();
        scan.close();
        grade(a);
    }

    static void grade(int a){
        if (a > 90 && a <=100) {
            System.out.println("AA grade");
        }else if (a > 80 && a <= 90) {
            System.out.println("AB Grade");
        }else if (a > 70 && a <= 80) {
            System.out.println("BB Grade");
        }else if (a > 60 && a <= 70) {
            System.out.println("BC Grade");
        }else if (a > 50 && a <= 60) {
            System.out.println("CD Grade");
        }else if (a > 40 && a <= 50) {
            System.out.println("DD Grade");
        }else if (a <= 40) {
            System.out.println("Fail");
        }
    }
}
