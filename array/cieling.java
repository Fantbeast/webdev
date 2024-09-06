public class cieling {
    public static void main(String[] args) {

        int[] arr ={ 2,3,5,9,14,16,18};
        int target = 15;
        int ans= binary_search(arr,target);
        System.out.println(ans);}

    // function for the cieling of the number
// smallest number greater than equal to the target
    static int binary_search(int []arr, int target){
        int start =0;
        int end = arr.length-1;
        // might be possible that (start +end

        while(start<=end){
            int mid = start+(end- start)/2;
            if (target <arr[mid]){
                end=mid-1;
            }
            else if (target>arr[mid]) {
                start=mid+1;
            }
            else { // answer is found in the array
                return mid;
            }
        }
        return start;
    }

}




