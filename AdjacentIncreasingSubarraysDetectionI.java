class AdjacentIncreasingSubarraysDetectionI {
    public boolean hasIncreasingSubarrays(List<Integer> nums, int k) {
        var increas = 1;
        var prev = 0;
        var n = nums.size();
        for(int i = 1;i<n;i++){
            if(nums.get(i)>nums.get(i-1))
                increas++;
            else{
                if(increas / 2 >= k || Math.min(prev, increas) >= k) {
                    return true;
                }
                prev = increas;
                increas = 1;
            }
        }
        if (increas / 2 >= k || Math.min(prev, increas) >= k) 
            return true;
        
        return false;

    }
}
