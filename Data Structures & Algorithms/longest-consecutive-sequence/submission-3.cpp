class Solution {
public:
    int longestConsecutive(vector<int>& nums) {

        unordered_set<int>mp;
        if(nums.size()==0)return 0;
        int ans =1;
        for(auto ele: nums)
        {
           mp.insert(ele);
        }

        for(auto pr : mp)
        {
            int tempans = 1;
            int currele = pr;
            if(mp.find(currele-1)!=mp.end()) continue;
           
            // go right
            // currele = pr.first;
            currele+=1;
            while(mp.find(currele)!=mp.end())
            {
                tempans++;
                mp.erase(mp.find(currele));
                currele+=1;
            }

            ans = max(ans, tempans);
        }
        return ans;
        
    }
};
