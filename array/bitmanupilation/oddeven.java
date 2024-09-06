package bitmanupilation;
import java.util.Scanner;
import java.util.Arrays;
public class oddeven {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int odd= sc.nextInt();;
        System.out.println(isodd(odd));
    }
    public  static  boolean  isodd(int odd) {
        return (odd&1)==1;

    }
}
