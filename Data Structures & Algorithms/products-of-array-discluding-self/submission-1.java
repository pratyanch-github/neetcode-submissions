class Solution {
    public int[] productExceptSelf(int[] nums) {
        
       List<Integer> ctl = new ArrayList<>();
       List<Integer> ctr = new ArrayList<>();


       int n = nums.length;
       int prod=1;
       for(int i=0; i<n; i++)
       {
            prod*=nums[i];
            ctl.add(prod);
       }
       
       prod =1;
       for(int i=n-1;i>=0; i--)
       {
         prod*=nums[i];
         ctr.add(prod);
       }

       Collections.reverse(ctr);
    //    System.out.println(ctr);
    //    System.out.println(ctl);
       int[] ans = new int[n];
       for(int i=0; i<n; i++)
       {
         if(i==0)ans[i]=ctr.get(i+1);
         else if(i==n-1)ans[i]=ctl.get(i-1);
         else ans[i]=ctl.get(i-1)*ctr.get(i+1);
       }

       return ans;

    }
}  
