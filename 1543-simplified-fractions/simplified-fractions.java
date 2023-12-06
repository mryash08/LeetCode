class Solution {
    public static int gcd(int x,int y){
        if(x == 0) return y;
        return gcd(y % x,x);
    }
    public List<String> simplifiedFractions(int n) {
        List<String> list = new ArrayList<>();
         for(int i=1; i<n; i++){
             for(int j=i+1; j<=n; j++){
                 if(gcd(i,j) == 1){
                     list.add(""+i+"/"+j);
                 }
             }
         }
         return list;
    }
}