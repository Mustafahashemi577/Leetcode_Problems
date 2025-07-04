class BaseballGame {
    public int calPoints(String[] operations) {
        int result = 0;
        var stack = new Stack<Integer>();
        for(String s : operations){
            if(s.charAt(0)=='+'){
                int temp1=0,temp2=0;
                if(!stack.empty())
                    temp1 = stack.pop();
                if(!stack.empty())
                    temp2 = stack.pop();
                if(temp2!=0)
                    stack.push(temp2);
                if(temp1!=0)
                    stack.push(temp1);
                if(temp1!=0&&temp2!=0)
                    stack.push(temp1+temp2);
            }
            else if(s.charAt(0)=='D'){
                stack.push(2*stack.peek());
            }
            else if (s.charAt(0)=='C')
                stack.pop();
            else{
                stack.push(Integer.parseInt(s));
            }
        }
        while(!stack.empty())
            result+=stack.pop();            

        return result;
    }
}
