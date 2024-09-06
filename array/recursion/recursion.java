package recursion;

public class recursion {
    public static void main(String[] args) {
        // writes thr number and print the function in the traditional way till way up to 5
        System.out.println("printing the function according to the recursion  ");
        print1(1);
    }
    // use of recursion to make the solution in the  loops;
    // function calling the another function
    static void print1(int n) {
        if(n==5){
            System.out.println("5");return;}
        System.out.println(n);
        print1(n + 1);
    }
}