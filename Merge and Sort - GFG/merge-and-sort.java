//{ Driver Code Starts
//Initial Template for Java

/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main(String[] args) throws IOException
	{
	        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t =
            Integer.parseInt(br.readLine().trim()); // Inputting the testcases
        while(t-->0)
        {
            int n = Integer.parseInt(br.readLine().trim());
            int a[] = new int[n+5];
            String inputLine[] = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(inputLine[i]);
            }
            
            int m = Integer.parseInt(br.readLine().trim());
            int b[] = new int[m+5];
            String inputLine1[] = br.readLine().trim().split(" ");
            for (int i = 0; i < m; i++) {
                b[i] = Integer.parseInt(inputLine1[i]);
            }
            
            
            int answer[] = new int[n+m+5];
            
            Solution obj = new Solution();
            int k=obj.mergeNsort(a, b, n, m, answer);
            StringBuilder output = new StringBuilder();
            for(int i=0;i<k;i++)
            output.append(answer[i]+" ");
            System.out.println(output);
            
        }
	}
}


// } Driver Code Ends


//User function Template for Java


class Solution {

    public static int mergeNsort(int a[], int b[], int n, int m, int answer[])
    {
        
        int i = 0;
        int j = 0;
        int idx = 0;
        
        int[] arr = new int[1000001];
        
        while(i < n && j < m ){
        
              arr[a[i++]]++;
                arr[b[j++]]++;
        }
        
        while(i < n){
           arr[a[i++]]++;
        }
         while(j < m){
            arr[b[j++]]++;
        }
        
        for(int k=0; k<arr.length; k++){
             if(arr[k]!= 0){
                answer[idx++] = k;
            }
        }
        
        
        return idx;
    }
}

