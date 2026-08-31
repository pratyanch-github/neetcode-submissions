class Solution {
public:

    string encode(vector<string>& strs) {
         string es = "";
         for(auto ele: strs)
         {
            int len = ele.length();
            es+=  "#" +  to_string(len) + "#" + ele ;
         }
        cout <<es<<endl;
         return es;
    }

    vector<string> decode(string s) {
       vector<string>ans;
    //    return ans;
       while(!s.empty())
       {
            int i=1; 
            string len = "";
            while(s[i]!='#')
            {
               len+=s[i];
               i++;
            }
            i++;
            int l = stoi(len);
            string temp=s.substr(i,l);
            ans.push_back(temp);
            s= s.substr(i+l);
       }

       return ans;
    }
};
