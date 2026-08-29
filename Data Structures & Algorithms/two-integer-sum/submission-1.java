class Solution {
    public int[] twoSum(int[] nums, int target) {

       // 2 solutions 
    //    1. using hashmap
    //    2. sorting + two pointers

      Map<Integer,Integer> mp= new HashMap<>();
      int[] ans = new int[2];
      int i=0;
      for(var ele: nums)
      {
         if(mp.containsKey(target-ele)==true)
         {
            ans[0]=(mp.get(target-ele));
            ans[1]=(i);
            return ans;
         }
         else {
            mp.put(ele,i);
         }



         i++;
      }

      return ans;


    }
}
