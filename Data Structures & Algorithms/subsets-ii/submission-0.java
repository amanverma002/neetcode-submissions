class Solution {
    public void findsubsets(int[] nums, int ind, List<List<Integer>>ans, List<Integer>ds){
        if(ind==nums.length){
            ans.add(new ArrayList<>(ds));
            return;
        }
        ds.add(nums[ind]);
        findsubsets(nums,ind+1,ans,ds);
        ds.remove(ds.size()-1);
        while(ind+1<nums.length && nums[ind]==nums[ind+1]){
            ind++;

        }
        findsubsets(nums,ind+1,ans,ds);
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>>ans=new ArrayList<>();
        findsubsets(nums,0,ans,new ArrayList<>());
        return ans;
    }
}
