// Merge 2 sorted array
import java.util.*;

public class Array7{
    public static void main(String[] args) {
        
        int[] a={1,4,9,2};

        int[] b={3,7,6};

        int[] c= new int[a.length + b.length];

        for(int i=0;i<a.length; i++){
            c[i]=a[i];
        }

        for(int i=0; i<b.length; i++){
            c[i + a.length]= b[i];
        }
      
        Arrays.sort(c);
System.out.println(Arrays.toString(c));
    }
}
