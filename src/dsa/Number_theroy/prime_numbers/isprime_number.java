package Number_theory;

public class isprime_number {
    public static Boolean isPrime(int N){
        for(int i=2;i<=Math.sqrt(N);i++){
            if(N%i==0) return false;
        }
        return  true;
    }
    public static void main(String[]args){
        System.out.println(isPrime(9));
    }
}
/*
* in this approach the time complexity reduced to O(Sqrt(N)), to get it to O(1) we use sieve array
*
* */