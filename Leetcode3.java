class Leetcode3 {
    public int lengthOfLongestSubstring(String s) {
        int l = 0,r=0, maxL=0;
        var map = new HashMap<Character,Integer>();
        while(r<s.length()){
            if(map.containsKey(s.charAt(r))){
                if(map.get(s.charAt(r))>=l){
                    l=map.get(s.charAt(r))+1;
                }
            }
            maxL = Math.max(maxL,r-l+1);
            map.put(s.charAt(r),r++);
        }
        return maxL;
    }
}
