// to find the middle elements of the array but we will not use the length function of the array
// apply the second approch to find the middle element  of the array
// make the chunks of the array  by providing the array to be in the given problem
// ONE ANSWER THAT WE CAN SIMPLY USE IS TO DOUBLING IT EVERY TIME THE ARRAAY IS GIVEN

public class PosistionOfInfiniteNumber {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 9, 10, 12, 14, 16, 18, 20, 22, 24, 26, 28, 30, 32, 34, 36, 38, 40}; // Example sorted array
        int target = 22; // Example target

        int result = search(arr, target);
        if (result != -1) {
            System.out.println("Target found at index: " + result);
        } else {
            System.out.println("Target not found in the array.");
        }
    }
    static  int search(int[] arr, int target){
        int start=0;
        int end= 1;


        while(start<=end){
            if(arr[end]>target){
              return binary_search(arr,target,start, end);

            }
            else {
                start=end+1;
                end*=2;

                if(end>=arr.length) {
                    end= arr.length-1;
                    break;
                }

                }

            }

        return binary_search(arr,target,start, end);
        }



    // binary search of the array
    static int binary_search(int []arr, int target, int st, int ed){
        int start =st;
        int end = ed;
        // might be possible that (start +end)

        while(start<=end){
            int mid = start+(-start+end)/2;
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
