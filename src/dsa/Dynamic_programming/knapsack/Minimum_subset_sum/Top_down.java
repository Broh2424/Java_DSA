package Dynamic_programming;

public class Top_down {
    public static int findMin(int arr[],int n){
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=arr[i];
        }
        boolean[][] dp =new boolean[n+1][sum+1];
        for(int i=0;i<=n;i++){
            for(int j=0;j<=sum;j++){
                if(i==0){
                    dp[i][j]=false;
                }
                else if(j==0){
                    dp[i][j]=true;
                }
                else {
                    if(arr[i-1]<=j){
                        dp[i][j]=dp[i-1][j-arr[i-1]]||dp[i-1][j];
                    }
                    else{
                        dp[i][j]=dp[i-1][j];
                    }
                }
            }
        }

        int diff=Integer.MAX_VALUE;
        for(int j=sum/2;j>=0;j--){
            if(dp[n][j]==true){
                diff=sum-2*j;
                break;
            }
        }
        return  diff;
    }
}
