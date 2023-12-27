class Solution {
    public List<Integer> grayCode(int n) {
        int[] temp = new int[1 << n];
        List<Integer> list = new ArrayList<>();
        int curr = 0;
        while(list.size() != temp.length){
              list.add(curr);
              temp[curr] = -1;
              int i=0;
              while(i < n){
                   int tem = curr ^ (1 << i);
                   if(temp[tem] == 0) {
                       curr = tem;
                       break;
                   }
                   i++;
              }
        }
        return list;
        // return findGrayCode(n,0,new ArrayList<>(),new boolean[1 << n]);
    }
    public List<Integer> findGrayCode(int n,int t,List<Integer> ans,boolean[] check){
         if(ans.size() == check.length) return ans;
         ans.add(t);
         check[t] = true;
         for(int i=0; i<n; i++){
            int temp = t ^ (1 << i);
            if(!check[temp]){
                return findGrayCode(n,temp,ans,check);
            }
         }
         return ans;
    }
}