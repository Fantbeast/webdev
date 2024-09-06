package recursion;

public class Nto1 {
    public static void main(String[] args) {
        System.out.println(n(5));
       reverse(5);
    }
    static  int n (int n ){
        System.out.println(n);
        if(n!=0){
            return n(n-1);
      }
        return 0;
    }
// to print the number in reverse method and with the help pf stack we can simply understand;
    static void reverse (int n){
        if(n==0){
            return ;
        }
        else {
             reverse(n-1);
            System.out.println(n);
        }
// to reverse the digit of the number

    }
}
