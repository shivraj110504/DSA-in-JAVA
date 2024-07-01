package java_02_ConditionalsAndLoops.CodeFiles;

public class loops {
    public static void main(String[] args) {

        //programs to print number upto 5
         for(int i=1; i<= 5; i++){
            System.out.println(i);
        }

        int i = 1;
        while (i<=5) {
            System.out.println(i);
            i++;
        }

        int n=1;
        do{
            System.out.println(n);
            n++;
        }while(n<=5);
    }
}
