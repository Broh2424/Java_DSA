package Dynamic_programming;

import java.util.Arrays;



public class Main {
    public  static  void main(String args[]){
        int set[]={3,34,4,12,5,2};
        int sum=12;
        int n=set.length;
         int dp[][]=new int[n+1][sum+1];
         for(int rows[]:dp){
             Arrays.fill(rows,-1);
         }
         System.out.println("Memozisation");
        if(Memozisation.isSubsetSum(set,n,sum,dp)==1){
          System.out.println("There exist a subset sum");
        }
        else{
            System.out.println("There is no subset Sum");
        }
        System.out.println("Top Down ");
        if(Top_down.isSubsetSum(set,n,sum,dp)!=0){
            System.out.println("There exist a subset sum");
        }else {
            System.out.println("There is no subset Sum");

        }
    }

}
