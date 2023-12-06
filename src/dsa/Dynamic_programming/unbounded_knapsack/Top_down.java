package dsa.Dynamic_programming.unbounded_knapsack;

public class Top_down {
    public static int Unbounded_knapsack(int wt[],int[] val,int n,int capacity){
        int[][]dp=new int[n+1][capacity+1];
        for(int i=0;i<n+1;i++){
            for(int j=0;j<capacity+1;j++){
                if(i==0)
                    dp[i][j]=0;
                else if(j==0){
                    dp[i][j]=1;
                }
                else{
                    if(wt[i-1]<=j){
                        dp[i][j]=Math.max(val[i-1]+dp[i][j-wt[i-1]],dp[i-1][j]);
                    }
                    else{
                        dp[i][j]=dp[i-1][j];
                    }
                }
            }
        }

        return dp[n][capacity];
    }
}
