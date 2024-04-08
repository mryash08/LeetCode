class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        int zero = 0;
        int one = 0;
        for(int i=0; i<students.length; i++){
             if(students[i] == 0){
                 zero++;
             }else{
                 one++;
             }
        }
        for(int i : sandwiches){
            if(i == 0 && zero != 0) zero--;
            else if(i == 0  && zero == 0) return one;
            else if(i == 1 && one != 0) one--;
            else return zero; 
        }
        return zero + one;
    }
}