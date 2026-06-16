class Solution {
    private void findsubsets(int ind, int[] nums, List<List<Integer>>ans, List<Integer>ds){
        if(ind==nums.length){
            ans.add(new ArrayList<>(ds));
             return;
        }
        
        ds.add(nums[ind]);
    findsubsets(ind+1,nums,ans,ds);
    ds.remove(ds.size()-1);
     findsubsets(ind+1,nums,ans,ds);
    }

    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>>ans=new ArrayList<>();
        findsubsets(0,nums,ans,new ArrayList<>());
        return ans;
        
    }
}