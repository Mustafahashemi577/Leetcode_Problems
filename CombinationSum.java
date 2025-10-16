class CombinationSum {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        helper(0, 0, candidates, temp, result, target);
        return result;
    }
    public void helper(int idx, int sum, int[] arr, List<Integer> temp, List<List<Integer>> result, int target) {
        if (idx == arr.length) {
            if (sum == target) {
                result.add(new ArrayList<>(temp));
            }
            return;
        }
        if(sum>target)
            return ;
        temp.add(arr[idx]);
        helper(idx, sum + arr[idx], arr, temp, result, target);
        temp.removeLast();
        helper(idx + 1, sum, arr, temp, result, target);
    }
}
