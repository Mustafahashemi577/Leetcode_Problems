class Majority_Element {
    public int majorityElement(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i : nums){
            if(!map.containsKey(i))
                map.put(i,map.getOrDefault(i,0)+1);
            else
                map.put(i,map.get(i)+1);
        }
        int number=0;
        int result = 0;
        for(int temp : map.keySet()){
            if(number<map.get(temp)){
                number = map.get(temp);
                result = temp;
            }
        }
        return result;
    }
}