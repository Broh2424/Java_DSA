package Dynamic_programming;

import java.util.Arrays;

public class Memozisation {

   static int memozisation_knapsack(int wt[], int val[], int n, int W, int dp[][]){
        if(n==0||W==0) return 0;
        if(dp[n][W]!=-1) return dp[n][W];
        if(wt[n-1]<=W){
            return
                    dp[n][W]=Math.max(val[n-1]+ memozisation_knapsack(wt, val, n-1, W-wt[n-1], dp),
                            memozisation_knapsack(wt, val, n-1, W, dp));
        } else  {
            return dp[n][W]= memozisation_knapsack(wt, val, n-1, W, dp);
        }

   }
    public static int memozisation(int wt[], int val[], int n, int W) {

        int dp[][]=new int[n+1][W+1];

        for(int row[]:dp){
            Arrays.fill(row,-1);// fills in row wise that means "n" wise
        }
        return memozisation_knapsack(wt, val, n, W,dp);
    }
}
