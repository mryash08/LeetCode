class Solution {
    public int findTheWinner(int n, int k) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0; i<n; i++){
          list.add(i+1);
        }
        return findWinner(list,0,k);
    }
    public int findWinner(ArrayList<Integer> list,int start,int k){
         if(list.size() == 1) return list.get(0);
        int n = list.size();
        int ele = k % n;
        int size = start-1;
        if(ele != 0) {
           size = (start + ele)-1;
        }
        if(size < 0) size = list.size()-1;
        if(size >= n) size = size - n;
        list.remove(size);
        return findWinner(list,size,k);
    }
}