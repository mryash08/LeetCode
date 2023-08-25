class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int countZero = 0;
   if(n == 0){
                    return true;
                }
      
        if(flowerbed[0] == 0){
            countZero++;
        }
        for(int i=0; i<flowerbed.length; i++){

            if(countZero == 0 && flowerbed[i] == 0){
                countZero++;
            }else if(i != flowerbed.length-1 && countZero == 1 && flowerbed[i] == 0 && flowerbed[i+1] == 0){
                flowerbed[i] = 1;
                n--;
                  if(n == 0){
                    return true;
                }
                countZero = 0;
            }else{
                countZero = 0;
            }
            


        }

        if(flowerbed.length > 1 && flowerbed[flowerbed.length-1] == 0 && flowerbed[flowerbed.length-2] == 0 || flowerbed.length == 1 && flowerbed[0] == 0){
            n--;
        }
       


        if(n == 0){
            return true;
        }else{
            return false;
        }
    }
}