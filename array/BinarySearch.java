public class BinarySearch {
    public static void main(String[] args) {

        int[] arr ={ -12,-11,-10, 2,3,6,7,8,9,10,12,345};
        int target = 10;
        int ans= binary_search(arr,target);
        System.out.println(ans);}

// function for the binary search
// return -1 if the number is not to be found in the function
    static int binary_search(int []arr, int target){
        int start =0;
        int end = arr.length-1;
        // might be possible that (start +end

        while(start<=end){
            int mid =start +(-start+end)/2;
            if (target <arr[mid]){
                end=mid-1;
            }
            else if (target>arr[mid]) {
                start=mid+1;
            }
            else {return mid;}
        }
        return -1;
    }

}




