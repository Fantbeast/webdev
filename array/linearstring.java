import java.util.Arrays;
import java.util.ArrayList;
import java.util.Scanner;

public class linearstring
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("input the number to be search in the array");
        String srch= "siddharth";
         char target= 's';
        System.out.println(search(srch,target));

    }
    static boolean search(String str, char target){
        if (str.isEmpty()){
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
               if (target==str.charAt(i)) {
                        return true;
            }
        }
        System.out.println("the character is not found in the string");
        return false;


    }
}
