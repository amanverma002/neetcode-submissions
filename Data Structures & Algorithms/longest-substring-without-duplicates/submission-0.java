class Solution {
    public int lengthOfLongestSubstring(String s) {
        int  n=s.length();

        int left=0;
        int maxlen=0;
        HashMap<Character,Integer>mp=new HashMap<>();
        //char c=s.charAt(right);

        for(int right=0; right<n; right++){
             char c = s.charAt(right);
            if(mp.containsKey(c)&&mp.get(c)>=left){
                left=mp.get(c)+1;
            }
            mp.put(c,right);

            int len=right-left+1;
            maxlen=Math.max(maxlen,len);
        }
        return maxlen;
    }
}
