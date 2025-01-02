package Stack;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class MinStack {
    List<Integer> stack;
    PriorityQueue<Integer> q;
    public MinStack() {
        stack=new ArrayList<>();
        q=new PriorityQueue<>();
    }
    
    public void push(int val) {
        stack.add(val);
        q.add(val);
    }
    
    public void pop() {
        if(stack.size()==0){
            return ;
        }
        int topele=stack.remove(stack.size()-1);
        q.remove(topele);
    }
    
    public int top() {
        return stack.get(stack.size()-1);
    }
    
    public int getMin() {
        return q.peek();
    }
}
