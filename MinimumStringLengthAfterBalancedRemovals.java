class MinimumStringLengthAfterBalancedRemovals {
    public int minLengthAfterRemovals(String s) {
        int as=0,bs=0;
        for(char c : s.toCharArray()){
            if(c=='a')
                as++;
            else
                bs++;
        }
        return Math.abs(as-bs);
    }
}
