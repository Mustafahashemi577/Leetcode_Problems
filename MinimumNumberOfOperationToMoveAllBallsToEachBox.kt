class MinimumNumberOfOperationToMoveAllBallsToEachBox {
    fun minOperations(boxes: String): IntArray {
        val result = IntArray(boxes.length)
        for(i in 0..boxes.length-1){
            var temp = 0
            for(j in 0..boxes.length-1){
                if(i==j)
                    continue
                if(boxes[j]=='1')
                    temp+=abs(i-j)
            }
            result[i]=temp
        }
        return result;
    }
}
