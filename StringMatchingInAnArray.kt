class StringMatchingInAnArray {
    fun stringMatching(words: Array<String>): List<String> {
        val list = ArrayList<String>()
        for(i in 0 until words.size)
            for(j in i+1 until words.size){
                if(words[i].contains(words[j])&&!list.contains(words[j]))
                    list.add(words[j]);
                if(words[j].contains(words[i])&& !list.contains(words[i]))
                    list.add(words[i]);
            }
        return list;
    }
}
