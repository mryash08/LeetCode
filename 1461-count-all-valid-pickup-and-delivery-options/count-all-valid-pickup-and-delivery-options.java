class Solution {
    public int countOrders(int n) {
        int orders = n*2;
        long ans = 1;

        while(orders>0){
            ans = ans * (orders * (orders-1))/2 % 1000000007;
            orders -= 2;
        }

        return (int)ans;
    }
}