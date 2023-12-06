package Dynamic_programming;

public class Recursive {

    public static int LCS_recursive(int x,int y,String s1,String s2){
       if(x==0||y==0) return 0;
       else {
           if(s1.charAt(x-1)==s2.charAt(y-1)){
               return  1+LCS_recursive(x-1,y-1,s1,s2);
           }else {
               return  Math.max(LCS_recursive(x-1,y,s1,s2),LCS_recursive(x,y-1,s1,s2));
           }
       }
    }
    public static void main(String[] args){
        String s1="abcdgh",s2="abedfhr";
        System.out.println(LCS_recursive(s1.length(),s2.length(),s1,s2));
    }
}
