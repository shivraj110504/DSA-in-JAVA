package java_03_Functions.CodeFiles;

import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        fun(2,3,4,5,6,7,7,8,9,1,2);
        multiple(5, 7, "Shivraj");
    }

    static void multiple(int a, int b, String ...v){

    }

    static void fun(int ...v){
        System.out.println(Arrays.toString(v));
    }
}
