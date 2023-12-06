package dsa.Dynamic_programming.knapsack.Minimum_subset_sum;

public class Main {
    public static void main(String[] args){
        int arr[] = { 3, 1, 4, 2, 2, 1 };
        int n=arr.length;
        System.out.println(Top_down.findMin(arr,n));
    }
}
