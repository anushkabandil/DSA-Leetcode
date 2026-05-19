class MyQueue {
     Stack<Integer> first ;
     Stack<Integer> second ;

    public MyQueue() {
       first =  new Stack<>();
       second =  new Stack<>();
    }
    
    public void push(int x) {
        first.push(x);
    }
    
    public int pop()  {
         // Move elements if second stack is empty
        if(second.isEmpty() ){
            while(!first.isEmpty()){
                second.push(first.pop());
            }
        }
        int removed = second.pop();
        return removed;
    }
    
    public int peek() {

        if(second.isEmpty()){
            while(!first.isEmpty()){
                second.push(first.pop());
            }
        }
        int peeked = second.peek();
        return peeked;
    }
    
    public boolean empty() {
        return first.isEmpty() && second.isEmpty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */