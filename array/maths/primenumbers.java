package maths;

public class primenumbers {
    public static void main(String[] args) {
    int n=30;
    boolean [] primes= new  boolean[n+1];
    sieve(n, primes);
    }

    // primes in all the value is false;
    // true is all the values that are not prime;
    static  void sieve(int n , boolean [] primes){
        for (int i = 2; i*i < n ; i++) {
             if( !primes [i]){
                 for (int j = 2*i; j <=n ; j+=i) {
                     primes[j]= true;
                 }

             }
        }
         for(int i=0; i<=n;i++){
             if(!primes[i]){
                 System.out.print( i+" ");
             }
         }
    }
}
