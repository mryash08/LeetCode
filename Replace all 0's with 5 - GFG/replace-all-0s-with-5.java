//{ Driver Code Starts
import java.util.Scanner;
import java.lang.Math;

class Convert_To_Five {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            System.out.println(new GfG().convertfive(N));
            T--;
        }
    }
}
// } Driver Code Ends


class GfG {
    int convertfive(int num) {
       
       int tempnum = num;
       int addSum = 0;
       int multi = 1;
       
       while( tempnum > 0){
           
           if(tempnum % 10 == 0){
              
                  addSum += 5 * multi;
               
             
             
              
           }
             multi *= 10;
           
           tempnum = tempnum/10;
       }
       
       return num + addSum;
    }
}