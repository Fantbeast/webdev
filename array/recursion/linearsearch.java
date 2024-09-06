package recursion;

import java.util.ArrayList;

public class linearsearch {
    public static void main(String[] args) {
        int []arr={1,2,3,4,5,8,7,8,8,34,56};
        search(arr,0,8);
        System.out.println( list);
// to find all the index in the array repeated by the array in the given problem
    }
    // if you want to return the list or the multiple value  the use the list
     static ArrayList<Integer> list = new ArrayList<>();
    static void search(int[] arr,int index,int value){
        if (index>arr.length-1){
                 return;
                }
        if (arr[index]==value){
            list .add(index);
        }
        search(arr, index + 1, value);
    }
}