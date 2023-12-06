package Number_theory;

import java.util.Arrays;
import java.util.Scanner;

public class sieves_of_Eratosthenes {
    public  static  long N=1000000;

    public static  void Sieves(Boolean[] sieves){
          sieves[1]=sieves[0]=false;
          // initially making all Odd numbers as prime numbers
          for(long i=3;i<=N;i+=2){
              sieves[(int) i]=true;
          }

          // making all multiples of "i" is not prime
          for(long i=3;i<=N;i++){
              if(sieves[(int) i]){
                  for(long j=i*i;j<=N;j=j+i){
                      sieves[(int) j]=false;
                  }
              }
          }
    }

    public static  void  main(String[] args){
        Boolean [] sieves= new Boolean[(int) (N+1)];
        // making every number is not prime
        Arrays.fill(sieves, Boolean.FALSE);
        Sieves(sieves);
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number upto to print prime numbers");
         int M= sc.nextInt();
         for(int i=2;i<=M;i++){
             if(sieves[i]){
                 System.out.print(" "+ i +" ");
             }
         }
    }

}
