class Solution {
    public void reverseString(char[] s) {
        
        //int n=s.length;

        //char[]arr= s.toCharArray();

        int start=0;
        int right=s.length-1;

        while(start<right){
            char temp=s[start];
            s[start]=s[right];
            s[right]=temp;
            start++;
            right--;
        }
    }
}