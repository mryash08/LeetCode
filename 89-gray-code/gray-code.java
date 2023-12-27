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
    }
}