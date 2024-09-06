package recursion;

public class coutingzero {
    public static void main(String[] args) {
        //input the number of zeroes
        System.out.println(digit(100 ,0));
    }
    static int digit(int num, int count){
        if( num==0){
            return count;
        }
        if (num%10==0){
            count ++;
        }
        return digit(num/10,count);

    }
}
