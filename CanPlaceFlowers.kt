class CanPlaceFlowers {
    fun canPlaceFlowers(flowerbed: IntArray, n: Int): Boolean {
        val a = IntArray(flowerbed.size+2)
        var n = n
        for(i in 0 until flowerbed.size)
            a[i+1]=flowerbed[i]
        for(i in 1 until a.size-1){
            if(a[i-1]==0 && a[i]==0 && a[i+1]==0){
                a[i]=1
                n--
            }
        }
        return n<=0
    }
}
