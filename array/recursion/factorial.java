package recursion;

public class factorial {
    public static void main(String[] args) {
        fact(5,1);
    }
    static void fact(int i, int sum){
        if(i==0) {
            System.out.print("the factorial of the number is:: ");
            System.out.print(sum);
            return;
        }  sum*=i;

        fact(i-1,sum);

    }
}
