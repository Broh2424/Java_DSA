package Searching_techniques;


//{ Driver Code Starts
import java.lang.*;
        import java.io.*;

class BinarySearch
{

    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());

        while(t-- > 0)
        {
            String s[] = read.readLine().trim().split("\\s+");

            int n = Integer.parseInt(s[0]);
            int k = Integer.parseInt(s[1]);

            int arr[] = new int[n];

            String st[] = read.readLine().trim().split("\\s+");

            for(int i = 0; i < n; i++)
            {
                arr[i] = Integer.parseInt(st[i]);
            }
            solution obj=new solution();


            System.out.println(obj.searchInSorted(arr, n, k));
        }
    }
}
// } Driver Code Ends
//
class solution{
    static int searchInSorted(int arr[], int size, int data)
    {
        int start=0,end=size-1,mid;
        while(start<=end){
            mid=start+(end-start)/2;

            if(data==arr[mid])
                return 1;
            else if(data<arr[mid])
                end=mid-1;
            else
                start=mid+1;

        }
        return -1;

    }
}
