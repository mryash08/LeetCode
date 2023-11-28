class Solution {
    public int numberOfWays(String corridor) {
        int sCount = 0;
        int pCount = 0;
        int i=0;
        long ans = 1;
        int mCount = 0;
        while(i<corridor.length()){
            pCount = 0;
            sCount = 0;
            while(i<corridor.length() &&  sCount != 2){
                if(corridor.charAt(i) == 'S'){
                    sCount++;
                    mCount++;
                }
                i++;
            }
            while(i<corridor.length() && corridor.charAt(i) == 'P'){
                pCount++;
                i++;
            }
         if(i<corridor.length()) ans =  ((pCount+1) * ans) % 1000000007;

        }
        if(sCount % 2 == 1 || mCount == 0) return 0;

        return (int)(ans);
    }
}