package recursion;
import  java.util.ArrayList;
// what is you want to add the list in the array but does not want to define it outside the array

import java.util.ArrayList;

public class linearsearch02 {
    public static void main(String[] args) {
        int []arr={1,2,3,4,5,8,7,8,8,34,56};

        System.out.println(search2(arr,0,8));// we will add new array list in the function which will pass the referece variable in the function given below
// to find all the index in the array repeated by the array in the given problem
    }
    // if you want to return the list or the multiple value  the use the list
// step 1 = make the return type as the list and put one more argument in the function
    static ArrayList search(int[] arr,int index,int value,ArrayList<Integer>list){
        if (index>arr.length-1){
            return list;
        }
        if (arr[index]==value){
            list .add(index);
            return list;
        }
       return search(arr, index + 1, value,list);
    }

    // method 2 of making and connecting the list from the reccursion  of the function
    //at every reccursion call every new array list is created and here we are trying to connect those array list no matter they are empty or filled;
    static ArrayList search2(int[] arr,int index,int value){
        ArrayList<Integer>list= new ArrayList<>();
        if (index>arr.length-1){
            return list;
        }
        if (arr[index]==value){
            list .add(index);
            return list;
        }
       ArrayList<Integer>answer= search2(arr, index + 1, value);
        list.addAll(answer);
        return list;
    }

}
