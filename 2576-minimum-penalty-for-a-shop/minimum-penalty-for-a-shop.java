class Solution {
    public static int bestClosingTime(String customers) {
        int y = 0;
        int n = 0;
        for(int i=0; i<customers.length(); i++){
            if(customers.charAt(i) == 'Y'){

                y++;
            }else{
                n++;
            }
        }



        int ans = 0;
        int minPenlty = Integer.MAX_VALUE;
        int previousn = 0;

        for(int i=0; i<customers.length(); i++){
            int penlty = 0;
            if(customers.charAt(i) == 'Y'){
                penlty = y+previousn;
                y--;
            }else{
                penlty = y+previousn;
                previousn++;


            }

            if(penlty < minPenlty){
                ans = i;
                minPenlty = penlty;
            }
        }

        if(previousn < minPenlty){
            return customers.length();
        }


        return ans;
    }
}