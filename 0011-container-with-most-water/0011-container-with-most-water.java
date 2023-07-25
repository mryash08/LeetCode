class Solution {
    public int maxArea(int[] height) {
        
       int m=0;
        int n=height.length-1;
        int ans = 0;
        
 

        while(m < n){
            int a = Math.min(height[m],height[n]);
            ans =  Math.max(ans, a * (n-m));
            if(height[m] < height[n]){
                m++;
             
            }else{
                
            
            n--;
        }
        }

        return ans;
        
    }
}