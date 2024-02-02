class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        int num = low;
        int temp = 0; int cnt = 1; int add = 0;
        while(num != 0){
            num = num/10;
            temp = (10*temp) + cnt;
            cnt++;
            add = add*10 + 1;
        }
        ArrayList<Integer> list = new ArrayList<>();
        int idx = temp;
        while(high >= temp){
            if(temp >= low) list.add(temp);
            temp += add;
            if(temp % 10 == 0) return list;
            if(temp % 10 == 9){
                if(high >= temp && temp >= low) list.add(temp);
                temp = (idx * 10)+cnt;
                cnt++;
                idx = temp;
                add = add*10 + 1;
            }
        }
        return list;
    }
}