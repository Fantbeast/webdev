public class FirstAndLastPosition {
    public static void main(String[] args) {

    }
    public  int [] searchRange(int [] nums, int target){
        int [] ans = {-1,-1};
        ans[0]=search(nums,target,true);
        ans[1]= search(nums, target, false);
        return ans;}    // here we have to simply use the binaray search twice and the answer will be provided by the function    }
    public   int search(int[] arr, int target, boolean checkinleft) {
        int start = 0;
        int end = arr.length - 1;
            int ans=-1;
        // might be possible that (start +end

        while (start <= end) {
            int mid = (start + end) / 2;
            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                ans = mid;
                if (checkinleft) {// automaically it is true and the function autmatically identify the boolean value
                    end = mid - 1;

                } else {
                    start = mid + 1;
                }
            }
        }

        return ans;
    }

}


