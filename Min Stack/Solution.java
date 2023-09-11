class MinStack {

    class Node{

        int val;
        int min;

        public Node(int val, int min){

            this.val = val;
            this.min = min;
        }
    }

    Stack<Node> stck;
    int min;

    public MinStack() {
        
        stck = new Stack<>();
        min = 2147483647;        
    }
    
    public void push(int val) {

        if(stck.isEmpty()){

            min = val;
        } 
        else{

            min = Math.min(stck.peek().min, val);
        }

        stck.push(new Node(val, min));        
    }
    
    public void pop() {

        stck.pop();        
    }
    
    public int top() {

        return stck.peek().val;
        
    }
    
    public int getMin() {

        return stck.peek().min;
        
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
