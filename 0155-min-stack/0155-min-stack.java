class MinStack {
    Stack<Integer> s=new Stack<>();
    Stack<Integer> st=new Stack<>(); 
    public MinStack() {
        
    }
    
    public void push(int value) {
     s.push(value);
        if (st.isEmpty() || value <= st.peek()) st.push(value);
    }
    
    public void pop() {
        if (s.peek().equals(st.peek())) st.pop();
        s.pop();
    }
    
    public int top() {
        return s.isEmpty() ? -1 : s.peek();
    }
    
    public int getMin() {
        return s.isEmpty() ? -1 : st.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(value);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */