class Solution {
    public String complexNumberMultiply(String num1, String num2) {
            
            int[] dm1=new int[2];
    int[] dm2=new int[2];
    StringBuilder s=new StringBuilder();
    dm1=checkInt(num1);
    dm2=checkInt(num2);
    int int1=dm1[0];
    int int2=dm2[0];
    int img1=checkImg(num1,dm1[1]);
    int img2=checkImg(num2,dm2[1]);
    int prodin=int1*int2-img1*img2;
    int prodim=int1*img2+int2*img1;
    s.append(prodin);
	s.append("+");
    s.append(prodim);
    s.append("i");
    return s.toString(); 
}
 public int[] checkInt(String num){
     int[] intp=new int[2];
     String s=new String();
    for(int i=0;i<=4;i++){
        if(num.charAt(i)=='-' && i==0){
            continue;
        }
        if(num.charAt(i)=='+'){
            s=num.substring(0,i);
            intp[0]=Integer.parseInt(s);
            intp[1]=i;
            break;
        }
    }
     return intp;
 }
 public int checkImg(String num,int imin){
     int img=0;
     String s=new String();
     s=num.substring(imin+1,num.length()-1);
     img=Integer.parseInt(s);
    
     return img;
 }

    }
