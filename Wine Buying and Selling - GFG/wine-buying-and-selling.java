//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

public class GFG {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T>0)
        {
            int N = sc.nextInt();
            int arr[] = new int[N];
            for(int i=0; i<N; i++)
                arr[i] = sc.nextInt();
            
            Solution g = new Solution();
            long ans = g.wineSelling(arr,N);
            
            System.out.println(ans);
            T--;
        }
    }
}


// } Driver Code Ends
//User function Template for Java


class Solution {
    long wineSelling(int Arr[],int N){
        // code here
        long ans = 0;
        int i = 0, j = 0;
        while(true) {
            while (i < N && Arr[i] <= 0)
                i++;
            while (j < N && Arr[j] >= 0)
                j++;
            if(i == N || j == N ) break;
            int change = Math.min(Arr[i], -Arr[j]);
            ans += (Math.abs(i - j) * change);
            Arr[i] -= change;
            Arr[j] += change;
        }
        return ans;
    }
}

//{ Driver Code Starts.
// } Driver Code Ends