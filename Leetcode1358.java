class Leetcode1358 {
    public int numberOfSubstrings(String s) {
        int []chars = {-1,-1,-1};
        var ans = 0;
        for(int i = 0;i<s.length();i++){
            chars[s.charAt(i)-'a']=i;
            ans+=1+Math.min(chars[0],Math.min(chars[1],chars[2]));
        }
        return ans;
    }
}
