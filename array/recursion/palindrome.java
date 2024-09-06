package recursion;
// using recursion as the perlimnary function in the array
public class palindrome {
    public static void main(String[] args) {
        System.out.println( palin(23132));
    }
    static int reverse(int num){

            int digit= (int)(Math.log10(num)) +1;
            return helper( num,  digit);
    }

    private static int helper(int num, int digit){
        if (num%10==0){
            return num;
        }
        int rem = num%10;
        return rem*(int) (Math.pow(10,digit-1))+helper(num/10,digit);
    }
        static boolean palin(int num){
        return num == reverse(num);
        }
}

