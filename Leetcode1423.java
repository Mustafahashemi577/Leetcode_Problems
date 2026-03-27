class Leetcode1423 {
    public int maxScore(int[] cardPoints, int k) {
        int lSum = 0,rSum = 0,maxSum =0;
        for(int i = 0;i<k;i++)
            lSum+=cardPoints[i];
        var r=cardPoints.length-1;
        maxSum = Math.max(maxSum,lSum);
        for(int i = k-1;i>=0;i--){
            lSum -= cardPoints[i];
            rSum+=cardPoints[r--];
            maxSum = Math.max(maxSum,lSum+rSum);
        }
        return maxSum;
    }
}
