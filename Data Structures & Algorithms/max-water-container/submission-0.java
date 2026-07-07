class Solution {
    public int maxArea(int[] heights) {
        int n =heights.length;

        int left=0;
        int right=n-1;

        int maxarea=0;
        while(left<right){

        int height=Math.min(heights[left],heights[right]);
        int length=right-left;
        int area=height*length;

            maxarea=Math.max(area,maxarea);

            if(heights[left]<heights[right]){
                left++;
            }else{
                right--;
            }
        }
    
            return maxarea;
        }
    }

