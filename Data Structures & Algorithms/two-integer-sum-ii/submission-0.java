class Solution {
    public int[] twoSum(int[] num, int t) {
        Map<Integer,Integer>mp = new HashMap<>();
        int[] ans = new int[2];
        for(int i=0; i<num.length; i++)
        {
            int curr = num[i];
            if(mp.containsKey(t-curr))
            {
                ans[0]=mp.get(t-curr)+1;
                ans[1] = i+1;
                return ans;
            }
            mp.put(curr,i);
        }
        
        return ans;
    }
}
