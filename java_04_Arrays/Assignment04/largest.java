package java_04_Arrays.Assignment04;

public class largest {
    public static void main(String[] args) {
        int [] arr = {1,3,49,68,90};
            int max= arr[0];
            for (int i = 0; i < arr.length; i++) {
              if (arr[i] > max) {
                max= arr[i];
              }
            }
            System.out.println(max);
        
        
    }
    
}
