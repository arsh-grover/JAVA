class Solution {
public:
    vector<int> twoSum(vector<int>& arr, int target) {
        vector<pair<int,int>>ans;
        int n=arr.size();
        for(int i=0;i<n;i++){
            ans.push_back({arr[i],i});
        }
        sort(ans.begin(),ans.end());
        int left=0;
        int right=n-1;
        while(left<right){
            int sum=ans[left].first+ans[right].first;
            if(sum==target){
                return {ans[left].second,ans[right].second};
            }
            else if(sum>target){
                right--;
            }
            else left++;
        }
        return {-1,-1};
    }
};