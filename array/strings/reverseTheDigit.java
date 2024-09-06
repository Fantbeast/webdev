package strings;

public class reverseTheDigit {
    public static void main(String[] args) {
        System.out.println(number(1234));

    }
    static int number(int n){
        int sum=1;
        if (n==0){
            return sum;
        }
        sum=sum*10+(n%10);
      return  n%10 +number(n/10);

    }
// to find the number of digits in the number then we have to simply
    // int number =(int)(math.log(10)+1)
  //  return number
}
