class CountTheNumberOfSubstringsWithDominantOnes {
    public int numberOfSubstrings(String s) {
        int []pre = new int[s.length()+1];
        pre[0]=-1;
        for(int i = 0;i<s.length();i++){
            if(i==0 || (i>0 && s.charAt(i-1)=='0'))
                pre[i+1]=i;
            else
                pre[i+1]=pre[i];
        }
        int ans = 0;
        for(int i = 1;i<=s.length();i++){
            int count0=s.charAt(i-1)=='0'?1:0;
            int j = i;
            while(j>0&&count0*count0<=s.length()){
                int count1 = (i-pre[j])-count0;
                if(count0*count0<=count1)
                    ans+=Math.min(j-pre[j],count1-count0*count0+1);
                j=pre[j];
                count0++;
            }
        }
        return ans;
    }
}
