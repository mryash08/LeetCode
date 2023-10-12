class Solution {
    public int calPoints(String[] operations) {
        int record = 0;
        Stack<Integer> stack = new Stack<>();
        for(int i=0; i<operations.length; i++){
            switch(operations[i]){
                case "+": int temp = stack.pop();
                         int add = temp+stack.peek();
                         record += add;
                         stack.push(temp);
                         stack.push(add);
                         break;
                case "D":  temp = stack.peek() * 2;
                          record += temp;
                          stack.push(temp);
                          break;
                case "C":  temp = stack.pop();
                          record -= temp;
                          break;
                default :  temp = Integer.parseInt(operations[i]);
                          record += temp;
                          stack.push(temp);
                          break;
            }
        }
        return record;
    }
}