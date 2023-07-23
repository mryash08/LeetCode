class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        
    Arrays.sort(nums1);
        Arrays.sort(nums2);
        ArrayList<Integer> list = new ArrayList<>();
        
        int i = 0;
        int j = 0;
        
        while(i < nums1.length && j < nums2.length){
            if(nums1[i] > nums2[j]){
                j++;
            }else if (nums1[i] < nums2[j]){
                i++;
            }else{
                list.add(nums1[i]);
                i++;
                j++;
            }
        }
        
        int[] res = new int[list.size()];
        for(int k=0; k<res.length; k++){
            res[k] = list.get(k);
        }
        
        return res;
    }
    
}