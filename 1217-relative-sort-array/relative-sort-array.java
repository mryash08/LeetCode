class Solution {
    public int[] relativeSortArray(int[] A, int[] B) {
        TreeMap<Integer,Integer> map = new TreeMap<>();
        for(int i=0; i<A.length; i++){
            map.put(A[i], map.getOrDefault(A[i],0)+1);
        }
        int j=0; int i=0;
        while (j<B.length && i < A.length){
             if(map.containsKey(B[j])){
                 while (map.get(B[j]) != 0){
                     A[i++] = B[j];
                     map.put(B[j],map.getOrDefault(B[j],0)-1);
                 }
             }
             j++;
        }
        for (int k : map.keySet()){
                while (map.get(k) != 0){
                    A[i++] = k;
                    map.put(k,map.getOrDefault(k,0)-1);
                }
            }

        return A;
    }
}