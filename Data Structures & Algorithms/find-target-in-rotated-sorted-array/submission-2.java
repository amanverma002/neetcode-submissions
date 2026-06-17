class Solution {
    public int search(int[] nums, int target) {
        int n =nums.length;
        int count=0;
        for(int i=0; i<n; i++){
            if(nums[i]==target){
                return count;
            }else{
                count++;
            }
        }
        return -1;
    }
}
