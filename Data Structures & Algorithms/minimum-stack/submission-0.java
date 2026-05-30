class MinStack {

  private Stack<Integer> minstack;

    public MinStack() {
        minstack=new Stack<>();
           }
    
    public void push(int val) {
        minstack.push(val);
    }
    
    public void pop() {
       minstack.pop();
    }
    
    public int top() {
        return minstack.peek();
    }
    
    public int getMin() {
        Stack<Integer> tmp=new Stack<>();
        int mini=minstack.peek();
    while(!minstack.isEmpty()){
       
    mini=Math.min(mini,minstack.peek());
     tmp.push(minstack.pop());
    }

    while(!tmp.isEmpty()){
        minstack.push(tmp.pop());
    }
    return mini;}
}
