class Solution {
    public int[] countBits(int n) {

        HashMap<Integer,Integer> map = new HashMap<>();
        int[] ans = new int[n+1];

        for(int i=0; i<=n && i<=2; i++){
            if(i == 0){
                map.put(0,0);
              ans[0] = 0;
            }else{
          map.put(i,1);


          ans[i] = 1;

            }
        }
        for(int i=3; i<=n; i++){
            int val  = 0;
             if(i%2 == 0){
                  val = map.get(i/2);
                 map.put(i,val);
             
             }else{
                val = map.get(i/2) + 1;
                 map.put(i,val);
             }
            
    ans[i] = val;
        }
        return ans;
    }
}