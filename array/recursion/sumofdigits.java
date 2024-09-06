package recursion;

public class sumofdigits {
    public static void main(String[] args) {
        System.out.println(digit(1220));
        recursion(1220,0);
    }
    static int digit(int a){
        if(a==0){
            return 0;
        }
        int sum=0;

            while(a!=0){
                int digit=0;
                digit=a%10;
                sum+=digit;
                a/=10;

            }


        return sum;
    }
    static void recursion(int a,int sum)
    {
        if (a==0){
            System.out.println(sum);
            return ;
        }
        int digit=0;
        digit=a%10;
        a/=10;
        sum=sum+digit;
        recursion(a,sum);
        // return (n%10)+recursion(n/10);
    }
}
