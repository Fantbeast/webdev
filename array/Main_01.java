import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class Main_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Initializing one 2D array
        int[][] arr = {
                {1, 2, 3}, // 0th index
                {4, 5},    // 1st index
                {6, 7, 8, 9} // 2nd index
        };

        // Printing the 2D array
        for (int i = 0; i < arr.length; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }

        // Dynamic array implementation
        ArrayList<Integer> list = new ArrayList<>();
        list.add(90);
        System.out.println(list.get(0));

        // Using one 2D ArrayList
        ArrayList<ArrayList<Integer>> list1 = new ArrayList<>();

        // Initialize the 2D ArrayList
        for (int i = 0; i < 3; i++) {
            list1.add(new ArrayList<>());  // Adding an empty ArrayList at each index
        }

        // Adding elements to the 2D ArrayList
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("Enter element for list1[" + i + "][" + j + "]:");
                list1.get(i).add(sc.nextInt());
            }
        }

        // Printing the 2D ArrayList
        System.out.println(list1);
    }
}
