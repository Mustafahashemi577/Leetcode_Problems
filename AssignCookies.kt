class AssignCookies {
    fun findContentChildren(g: IntArray, s: IntArray): Int {
        g.sort()
        s.sort()
        var i = 0
        for(j in 0..s.size-1)
            if(g[i]<=s[j]){
                i++
                if(i==g.size)
                break;
            }
        return i;
    }
}
