class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        Queue<Integer> queue = new LinkedList<>();
        Stack<Integer> stack = new Stack<>();
        int zero = 0;
        int one = 0;

        for(int i=0; i<students.length; i++){
             if(students[i] == 0){
                 zero++;
             }else{
                 one++;
             }
             queue.add(students[i]);
        }

        for(int i=sandwiches.length-1; i>=0; i--){
            stack.push(sandwiches[i]);
        }

        while(queue.size()!=0){

             if(stack.peek() == 0 && zero == 0){
                return queue.size();
            }
            if(stack.peek() == 1 && one == 0){
                return queue.size();
            }
            if(queue.peek() == stack.peek()){

                int temp = queue.remove();
                if(temp == 1){
                    one--;
                }else{
                    zero--;
                }

                stack.pop();
            }else{
                queue.add(queue.remove());
            }

           
        }

        return queue.size();
    }
}