class Solution {
    public double averageWaitingTime(int[][] customers) {
        double lastTime = 0.0;
        double waitTime = 0.0;
        for(int i=0; i<customers.length; i++){
             if(lastTime < customers[i][0]){
                 lastTime = customers[i][0] + customers[i][1];
                 waitTime += customers[i][1];
              }else{
                 lastTime += customers[i][1];
                 waitTime += lastTime - customers[i][0];
              }
        }
        return waitTime/customers.length;
    }
}