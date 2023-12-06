package Dynamic_programming;

class Memozisation {
   public static int isSubsetSum(int set[],int n,int sum,int dp[][]){
        if(sum==0)
            return 1;
        else if(n==0)
            return 0;
        else  if(dp[n][sum]!=-1){
            return  dp[n][sum];
        }
        else if(set[n-1]<=sum){
            return dp[n][sum]=isSubsetSum(set,n-1,sum-set[n-1],dp)+isSubsetSum(set, n-1, sum,dp);
        }
        else {
            return  dp[n][sum]=isSubsetSum(set,n-1,sum,dp);
        }
    }
}
