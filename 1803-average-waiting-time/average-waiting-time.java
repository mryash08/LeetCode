class Solution {
    public double averageWaitingTime(int[][] customers) {
        double lastT = 0.0;
        double waitT = 0.0;
        for(int i=0; i<customers.length; i++){
             if(lastT < customers[i][0]){
                 lastT = customers[i][0];
              }
                 lastT += customers[i][1];
                 waitT += lastT - customers[i][0];
        }
        return waitT/customers.length;
    }
}