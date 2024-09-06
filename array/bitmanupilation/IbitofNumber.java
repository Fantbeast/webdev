package bitmanupilation;
import java.util.Scanner;
import  java.util.Arrays;
public class IbitofNumber {
    public static void main(String[] args) {
        Scanner in =new Scanner(System .in);
        int n = in.nextInt();
        int number=23;
        // mask = n-1 zeros;
        System.out.println(n&(1<<n-1));
    }
}
