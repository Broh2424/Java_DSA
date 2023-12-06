package Dynamic_programming;
// printing and returning length
public class Top_Down {
    public static String top_down(int x ,int y, String s1,String s2){
        String ans="";
        int[][]dp=new int[x+1][y+1];
        for(int i=0;i<x+1;i++){
            for(int j=0;j<y+1;j++){
                if(i==0||j==0){
                    dp[0][0]=0;
                }
                else if(s1.charAt(i-1)==s2.charAt(j-1)){
                    ans+=s1.charAt(i-1);
                    dp[i][j]=1+dp[i-1][j-1];
                }
                else {
                    dp[i][j]=Math.max(dp[i][j-1],dp[i-1][j]);
                }
            }
        }
        return ans;
    }
    public static void main(String[] args){
        String s1="abcdgh",s2="abedfhr";
         System.out.println(top_down(s1.length(),s2.length(),s1,s2));
    }
}
