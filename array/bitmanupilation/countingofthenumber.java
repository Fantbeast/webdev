package bitmanupilation;
import java.util.Scanner;
import java.util.Arrays;
public class countingofthenumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int input= in.nextInt();
        int []arr={2,3,3,2,2,4,5,4,5,4,5};
        int i=0;
        int result =0;
        for ( i=0;i<arr.length;i++) {

                    result^=arr[i];

        }
        System.out.println( result);

    }
}
