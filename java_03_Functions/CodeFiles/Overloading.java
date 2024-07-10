package java_03_Functions.CodeFiles;

import java.util.Arrays;

public class Overloading {
    public static void main(String[] args) {
        demo(2,3,4,5,6,7);
        demo("shivraj","raj");
    }

    static void demo(int ...v){
        System.out.println(Arrays.toString(v));
    }
    static void demo(String ...v){
        System.out.println(Arrays.toString(v));
    }

    static void fun(int a){

    }

    static void fun(String name){
        System.out.println(name);
    }

}
