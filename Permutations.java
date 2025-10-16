class Permutations {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> ds = new ArrayList<>();
        boolean freq[] = new boolean [nums.length];
        findPermutation(nums,ds,ans,freq);
        return ans;
    }
    public void findPermutation(int[] nums, List<Integer> ds,List<List<Integer>> ans,boolean[] freq){
        if(ds.size()==nums.length){
            ans.add(new ArrayList<>(ds));
            return;
        }
        for(int i = 0;i<nums.length;i++){
            if(!freq[i]){
                freq[i]=true;
                ds.add(nums[i]);
                findPermutation(nums,ds,ans,freq);
                ds.removeLast();
                freq[i]=false;
            }
        }

    }
}
