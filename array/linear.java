
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;
public class linear {
    public static void main(String [] args){
        int linear_search;
        Scanner in = new Scanner(System.in);
        System.out.println("input the number to be search in the array");

        int srch= in.nextInt();
        int []arr= {
                3,4,5,6,7,8,9
        };
             // linear search
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==srch){
                System.out.println("the number is to be found in the array at the index of ::"+i);
                break;
            }
            else{
                continue;
            }
        }
    }
}
