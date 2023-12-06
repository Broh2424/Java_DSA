package Dynamic_programming;

public class Main {
    public static void main(String[] args){
        int arr[] = { 3, 1, 4, 2, 2, 1 };
        int n=arr.length;
        System.out.println(Top_down.findMin(arr,n));
    }
}
