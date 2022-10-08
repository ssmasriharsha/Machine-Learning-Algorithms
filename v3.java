class Solution {
    private Set<List<Integer>> result;
    
    private void swap(int[] nums, int x, int y) {
        if(x == y) return;
        int swap = nums[x];
        nums[x] = nums[y];
        nums[y] = swap;
    }
    
    private void backtrack(int[] nums, int level) {
        if(level == nums.length) {
            List<Integer> res = new ArrayList<>(nums.length);
            for(int i : nums) {
                res.add(i);
            }
            result.add(res);
            return;
        }
        
        
        