class Leetcode3719 {
    public int longestBalanced(int[] nums) {
        var set1 = new HashSet<Integer>();
        var set2 = new HashSet<Integer>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0)
                set1.add(nums[i]);
            else
                set2.add(nums[i]);
        }
        if(set1.size()==set2.size())
            return nums.length;
            
        int maxLength = 0;
        for(int i = 0;i<nums.length;i++){
            var odd = new HashSet<Integer>();
            var even = new HashSet<Integer>();
            for(int j = i ;j<nums.length;j++){
                if(nums[j]%2==0)
                    even.add(nums[j]);
                else
                    odd.add(nums[j]);
                if(odd.size()==even.size())
                    maxLength = Math.max(maxLength,j+1-i);
            }
        }
        return maxLength;
    }
}
