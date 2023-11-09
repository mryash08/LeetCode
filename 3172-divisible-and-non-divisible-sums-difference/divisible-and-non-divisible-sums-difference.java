class Solution {
    public int differenceOfSums(int n, int m) {
        int totalSum = n*(n+1)/2;
        int lastdigit = n - (n % m);
        int diviSum = (lastdigit/m * (lastdigit/m + 1)) / 2 * m;
        return totalSum - (diviSum * 2);
    }
}