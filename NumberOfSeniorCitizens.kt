class NumberOfSeniorCitizens {
    fun countSeniors(details: Array<String>): Int {
        var count = 0
        for(detail in details){
            if(detail.substring(11,13).toInt()>60)
                count++
        }
        return count;
    }
}
