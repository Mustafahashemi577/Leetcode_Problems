class Leetcode85 {
    public int maximalRectangle(char[][] matrix) {
        if (matrix.length==0)
            return 0;
        int col = matrix[0].length;
        int []height = new int [col+1];
        int ans = 0;
        for(var row : matrix){
            for(int i = 0;i<row.length;i++){
                height[i]=(row[i]=='1')? height[i]+1:0;
            }
            var stack = new Stack<Integer>();
            stack.push(-1);
            for(int i = 0;i<=col;i++){
                int curr = (i<col)? height[i]:0;
                while(stack.peek()!=-1 && height[stack.peek()]>=curr){
                    int h = height[stack.pop()];
                    int w = i - stack.peek()-1;
                    ans = Math.max(ans,h*w);
                }
                stack.push(i);
            }
        }
        return ans;
    }
}
