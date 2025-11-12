class MinimumNumberOfOperationsToMakeAllArrayElementsEqualTo1 {
    public int minOperations(int[] nums) {
        int num1 = 0,g=0;
        for(int num : nums){
            if(num==1)
                num1++;
            g=gcd(g,num);
        }
        if(num1>0)
            return nums.length-num1;
        if(g>1)
            return -1;
        int minLen = nums.length;
        for(int i = 0;i<nums.length;i++){
            int currentGcd=0;
            for(int j = i;j<nums.length;j++){
                currentGcd = gcd(currentGcd,nums[j]);
                if(currentGcd==1){
                    minLen = Math.min(minLen,j-i+1);
                    break;    
                }
            }
        }
        return minLen+nums.length-2;
    }
    private int gcd(int a,int b){
        while(b!=0){
            int temp = b;
            b=a%b;
            a = temp;
        }
        return a;
    }
}
