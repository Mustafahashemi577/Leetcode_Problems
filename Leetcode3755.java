class Leetcode3755 {
    public int maxBalancedSubarray(int[] nums) {
        var map = new HashMap<String, Integer>();
        int pref=0;
        int balance = 0;
        int maxl = 0;
        map.put("0%0",-1);
        for(int i = 0;i<nums.length;i++){
            pref^=nums[i];
            if(nums[i]%2==0)
                balance++;
            else
                balance--;

            var key = pref+"%"+balance;
            if(map.containsKey(key)){
                var prev = map.get(key);
                maxl = Math.max(maxl,i-prev);
            }
            else{
                map.put(key,i);
            }
        }
        return maxl;
    }
}
