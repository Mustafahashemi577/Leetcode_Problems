class PalindromPartitioning2 {
    public int minCut(String s) {
        int n = s.length();
        int[] dp = new int[n];
        Arrays.fill(dp, Integer.MAX_VALUE);
        for (int center = 0; center < n; center++) {
            expand(s, center, center, dp);
            expand(s, center, center + 1, dp);
        }
        return dp[n - 1];
    }
    private void expand(String s, int left, int right, int[] dp) {
        int n = s.length();
        while (left >= 0 && right < n && s.charAt(left) == s.charAt(right)) {
            if (left == 0)
                dp[right] = 0;
            else
                dp[right] = Math.min(dp[right], dp[left - 1] + 1);
            left--;
            right++;
        }
    }
}

