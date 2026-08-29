class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> seen = new HashSet<>();
        for (int ele : nums) {
            if (!seen.add(ele)) {
                return true;
            }
        }
        return false;
    }
}