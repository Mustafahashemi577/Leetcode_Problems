class CountElementsWithMaximumFrequency {
    public int maxFrequencyElements(int[] nums) {
        int count[] = new int [101];
        for(var num : nums)
            count[num]++;
        var max = 0;
        var sum = 0;
        for(int i = 0;i<101;i++){
            if(count[i]>max){
                max = count[i];
                sum = count[i];
            }
            else if (count[i]==max)
                sum+=count[i];
        }
        return sum;
    }
}
