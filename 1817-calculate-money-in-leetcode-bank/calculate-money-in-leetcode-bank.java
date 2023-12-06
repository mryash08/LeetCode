class Solution {
    public int totalMoney(int n) {
        int remainingDay = n % 7;
        int tWeek = n/7;
        int r = tWeek + remainingDay;
        return (tWeek * 28) + ((((tWeek-1) * (tWeek)) / 2) * 7) + ((r * (r+1)/2) - (tWeek * (tWeek+1)/2));
    }
}