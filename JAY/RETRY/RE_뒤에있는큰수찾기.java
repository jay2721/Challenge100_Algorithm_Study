package JAY.RETRY;

import java.util.*;

public class RE_뒤에있는큰수찾기 {
    public static int[] numbers ={2,3,3,5};
    public static void main(String[] args) {
        int[] answer = new int[numbers.length];

        Stack<Integer> stack = new Stack<>();
        Arrays.fill(answer,-1);

        for(int i=numbers.length-1;i>=0;i--){
            while(!stack.isEmpty()){
                if(stack.peek()>numbers[i]){
                    answer[i]=stack.peek();
                    break;
                }
                stack.pop();
            }
            stack.add(numbers[i]);
        }

        System.out.println(Arrays.toString(answer));
    }
}
