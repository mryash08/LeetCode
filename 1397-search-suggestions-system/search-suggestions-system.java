class Solution {
    public List<List<String>> suggestedProducts(String[] products, String searchWord) {
        Arrays.sort(products);
        List<List<String>> ans = new ArrayList<>();
        char[] search = searchWord.toCharArray();
        int idx = 0; int lastidx = products.length-1;
        for(int i=0; i<search.length; i++){
            char temp = search[i];
            while(idx<products.length && (i >= products[idx].length() || products[idx].charAt(i) != temp)){
                idx++;
            }
            while(lastidx >= 0 && (i >= products[lastidx].length() ||products[lastidx].charAt(i) != temp)){
                lastidx--;
            }
            List<String> list = new ArrayList<>();
            if(idx <= lastidx) list.add(products[idx]);
            if(idx+1 <= lastidx) list.add(products[idx+1]);
            if(idx+2 <= lastidx) list.add(products[idx+2]);
            ans.add(list);
        }
        return ans;
    }
}