class Solution {
public:
    vector<int> twoSum(vector<int>& nums, int target) {
        map<int,int>mp;
        vector<int>ans;
        int i=0;
        for(auto ele: nums)
        {
            if(mp.count(target-ele))
            {   
                ans.push_back(mp[target-ele]);          
                ans.push_back(i);
                return ans;
            }
            else {
                mp[ele]=i;
            }

            i++;
        }
    }
};
