class Valid_Parentheses {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        boolean result = true;
        for(int i = 0;i<s.length();i++){
            if(s.charAt(i)=='(' || s.charAt(i)=='{' || s.charAt(i)=='[')
                stack.push(s.charAt(i));
            else{
                if(stack.empty()){
                    result = false;
                    break;
                }
                char temp = stack.pop();
                if(temp=='('&&s.charAt(i)==')' ||temp=='['&&s.charAt(i)==']' ||temp=='{'&&s.charAt(i)=='}')
                    continue;
                else{
                    result = false;
                    break;
                }
            }
            }
            if(!stack.empty())
            result = false;
            return result;
    }
}