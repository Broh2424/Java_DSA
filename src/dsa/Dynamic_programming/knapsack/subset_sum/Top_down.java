package dsa.Dynamic_programming.knapsack.subset_sum;

public class Top_down {
    public static int isSubsetSum(int set[],int n,int sum,int dp[][]){
        for(int i=0;i<n+1;i++){
            for(int j=0;j<sum+1;j++){
                if(i==0){
                   dp[i][j]=0;
                }
                else if(j==0&&i!=0) dp[i][j]=1;
                else {
                    if(set[i-1]<=j){
                        dp[i][j]=Math.max(dp[i-1][j-set[i-1]],dp[i-1][j]);
                    }
                    else{
                        dp[i][j]=dp[i-1][j];
                    }
                }
            }
        }

        return 0;

    }

}
