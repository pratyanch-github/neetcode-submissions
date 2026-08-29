class Solution {
    public boolean hasDuplicate(int[] nums) {
       Map<Integer, Integer> mp = new HashMap<Integer, Integer>();
       for( int ele: nums)
       {  
          if(mp.get(ele)==null)
          {
            mp.put(ele, 1);
          }
          else {
            return true;
            // mp.put(ele,mp.get(ele)+1);
          }
       } 

       return false;
    }
}