package recursion;

public class arrays {
    public static void main(String[] args) {
        int arr[]={1,2,2,3,5,6,7,7};
        System.out.println(sorted(arr,0));
// this code cant handle the condition in the condition when the arrays contain the same numbers

    }
    static boolean sorted( int [] arr, int index){

        // base condition
        if(index == arr.length-1){
            return true;
        }
         return  arr[index]<arr[index+1] && sorted(arr, index+1);
    }
}
