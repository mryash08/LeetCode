class Solution {
    public int numberOfWays(String corridor) {
        int sCount = 0;
        int pCount = 0;
        int i=0;
        long ans = 1;
        int mCount = 0;
        char[] arr = corridor.toCharArray();
        while(i<arr.length){
            pCount = 0;
            sCount = 0;
            while(i<arr.length &&  sCount != 2){
                if(arr[i] == 'S'){
                    sCount++;
                    mCount++;
                }
                i++;
            }
            while(i<arr.length && arr[i] == 'P'){
                pCount++;
                i++;
            }
         if(i<arr.length) ans =  ((pCount+1) * ans) % 1000000007;

        }
        if(sCount % 2 == 1 || mCount == 0) return 0;

        return (int)(ans);
    }
}