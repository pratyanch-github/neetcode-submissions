class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        
        Map<Integer,Integer> mp = new TreeMap<>();

        for(int ele: nums)
        {
            mp.put(ele, mp.getOrDefault(ele,0)+1);
        }

        List<List<Integer>> lst = new ArrayList<>();
        for(Map.Entry<Integer,Integer> entry: mp.entrySet())
        {
            lst.add(new ArrayList<>(List.of(entry.getKey(), entry.getValue())));
        }


        lst.sort((a,b)-> { 
            return -1*(a.get(1)-b.get(1));
        });

        int[] ans = new int[k];
        for(int i=0; i<k; i++)
        {
            ans[i] = lst.get(i).get(0);
        }

        return ans;




    }
}
