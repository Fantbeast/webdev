public class PeakIndehielxOfMountainArrray {
    public static void main(String[] args) {
        int[] arr = {0,10,5,2}; // Example sorted array
        int result = solution(arr);

            System.out.println("peak value of the array is aat index of the array ::" +result);

    }
    static int solution (int[] arr){
        int start =0;
        int end = arr.length-1;
        // might be possible that (start +end
        int mid=start+(end-start)/2;
        while (start<end){

            if(arr[mid+1]>arr[mid]){
                start=mid+1;
            }
            else {
                end=mid;
            }

        }return start
                ;

    }
}
