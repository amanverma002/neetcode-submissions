class Solution {
    public boolean search(int[] nums, int target) {
        int n =nums.length;
        int count=0;

        for(int i=0; i<n; i++){
            if(nums[i]==target){
                return true;
            }else{
                count++;
            }
        }
        return false;
    }
}