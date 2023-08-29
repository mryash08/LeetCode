class Solution {
    public static int bestClosingTime(String customers) {
        int y = 0;
        for(int i=0; i<customers.length(); i++){
            if(customers.charAt(i) == 'Y')y++;
        }
        int ans = 0;
        int minPenlty = Integer.MAX_VALUE;
        int previousn = 0;

        for(int i=0; i<customers.length(); i++){
            int penlty = 0;
            penlty = y+previousn;
            
            if(customers.charAt(i) == 'Y') y--;
            else previousn++;

            if(penlty < minPenlty){
                ans = i;
                minPenlty = penlty;
            }
        }
        if(previousn < minPenlty) return customers.length();
        
        return ans;
    }
}