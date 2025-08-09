class PowerOfTwo {
    fun isPowerOfTwo(n: Int): Boolean {
        if(n<=0)
            return false
        var num = n
        while(num%2==0){
            num/=2
        }
        return num==1
    }
}
