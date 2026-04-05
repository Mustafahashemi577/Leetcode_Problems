class Leetcode657 {
    public boolean judgeCircle(String moves) {
        int row = 0, col = 0;
        for(char c : moves.toCharArray()){
          if (c=='U')
            row--;
          else if (c=='D')
            row++;
          else if (c=='R')
            col++;
          else if (c=='L')
            col--;
        }
        if(col==0 && row == 0)
          return true;
        
        return false;
    }
}
