class DesignHashSet() {
    private var data = BooleanArray(1000001)
    fun add(key: Int) {
        data[key]=true;
    }
    fun remove(key: Int) {
        data[key]=false;
    }

    fun contains(key: Int): Boolean {
        return data[key]
    }

}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * var obj = MyHashSet()
 * obj.add(key)
 * obj.remove(key)
 * var param_3 = obj.contains(key)
 */
