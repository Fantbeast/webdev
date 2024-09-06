public class searching_2Darray {
    public static void main(String[] args) {
        int [][] arr={
                {3,4,5},
                {5,6,7},
                {3,2,6},
                {4,67,8}
        };
        int target =90;
        int searching = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j]==target){
                    System.out.println("the target number is found in the 2d array at index number ::"+i+","+j);
                     break;
                }
            }

        }
        System.out.println("the largest number in the array is::"+target);
    }
}
