class FirstUniqueCharacterInString {
    fun firstUniqChar(s: String): Int {
        var freq = IntArray(26);
        for(c in s.toCharArray())
            freq[c-'a']++
        for(i in 0..s.length-1){
            if(freq[s[i]-'a']==1)
                return i;
        } 
        return -1;
    }
}
