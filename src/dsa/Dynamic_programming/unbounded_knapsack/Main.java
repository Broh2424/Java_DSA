package dsa.Dynamic_programming.unbounded_knapsack;


public class Main {
    public static void main(String[] args){
        int wt[] = {1,2,4,5};
        int val[] = {5,4,8,6};
        int W=5;
        int n = wt.length;
        System.out.println("The Maximum value of items, thief can steal is(in Unbounded_knapsack) "+
                Top_down.Unbounded_knapsack(wt,val,n,W));
    }
}
