class Subsets {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        findSubset(0,nums,new ArrayList<>(),result);
        return result;
    }
    private void findSubset(int idx,int[] nums,List<Integer> list,List<List<Integer>> result){
        if(idx == nums.length){
            result.add(new ArrayList<>(list));
            return;
        }

        list.add(nums[idx]);
        findSubset(idx+1,nums,list,result);
        list.removeLast();
        findSubset(idx+1,nums,list,result);
    }
}
