class DecodeWaysII {
    public int numDecodings(String s) {
        final int MOD = 1_000_000_007;
        int n = s.length();
        long[] dp = new long[3]; 
        dp[1] = 1; 
        dp[2] = 0;

        for (int i = n - 1; i >= 0; i--) {
            char c = s.charAt(i);
            long curr = 0;

            if (c == '0') {
                curr = 0; 
            } else if (c == '*') {
                curr = (9 * dp[1]) % MOD;
            } else {
                curr = dp[1];
            }

            if (i + 1 < n) {
                char next = s.charAt(i + 1);
                if (c == '*' && next == '*') {
                    curr = (curr + 15 * dp[2]) % MOD; 
                } else if (c == '*') {
                    if (next >= '0' && next <= '6')
                        curr = (curr + 2 * dp[2]) % MOD; 
                    else
                        curr = (curr + dp[2]) % MOD;     
                } else if (c == '1') {
                    if (next == '*')
                        curr = (curr + 9 * dp[2]) % MOD; 
                    else
                        curr = (curr + dp[2]) % MOD;     
                } else if (c == '2') {
                    if (next == '*')
                        curr = (curr + 6 * dp[2]) % MOD; 
                    else if (next >= '0' && next <= '6')
                        curr = (curr + dp[2]) % MOD;     
                }
            }
            dp[0] = curr;
            dp[2] = dp[1];
            dp[1] = dp[0];
        }

        return (int) dp[0];
    }
}
