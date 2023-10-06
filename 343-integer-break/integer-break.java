class Solution {
    public int integerBreak(int n) {
        int division = 2;
        int maxProduct = 1;
        if(n == 3) return 2;
        while(n/division > 1){
            int sum = 0;
            int product = 1;
            for(int i=0; i<division-1; i++){
                sum += (n/division);
                product *= (n/division);
            }
            product *= (n - sum);

            if(product > maxProduct){
                maxProduct = product;
            }

             sum = 0;
             product = 1;
            for(int i=0; i<division-1; i++){
                sum += ((n/division) + 1);
                product *= ((n/division) + 1);
            }

            if(n - sum > 0){
               product *= (n - sum);
               if(product > maxProduct){
                maxProduct = product;
            }
            }
            
            
            division++;
        }
        return maxProduct;
    }
}