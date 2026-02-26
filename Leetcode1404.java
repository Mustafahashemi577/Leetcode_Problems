class Leetcode1404 {
    public int numSteps(String s) {
        var opp = 0;
        var carry = 0;
        for(int i = s.length()-1;i>0;i--){
            var temp = (s.charAt(i)-'0')+carry;
            if(temp%2==1){
                opp+=2;
                carry=1;
            }
            else
                opp++;
        }
        return carry+opp;
    }
}
