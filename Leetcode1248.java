class Leetcode1248{
    public int numberOfSubarrays(int[] nums, int k) {
        int res = 0, odd = 0, r = 0, l = 0, count = 0;
        while (r < nums.length) {
            if (nums[r] % 2 == 1) {
                odd++;
                count = 0;
            }
            while (odd == k) {
                count++; 
                if (nums[l] % 2 == 1)
                    odd--;
                l++;
            }
            res += count; 
            r++;
        }
        return res;
    }
}
