package strings;

import java.lang.reflect.Array;
import java.util.Arrays;

// taking inputs in java for the competative coding in java .
// operating the strings in the java
public class strings {
    public static void main(String[] args) {
        // till two digit value
        float a = 543.56343f;// write f after the number in order to get the write float
       // System.out.printf("%.2f",one);// 2 places only
        System.out.printf( "%.4f",Math.PI);
        String name = "siddharth ";
        System.out.println(Arrays.toString(name.toCharArray()) );// to create character array
        System.out.println(Arrays.toString(name.split(" ")));
        boolean[] seen = new boolean[256];

    }
}
