class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);

        String n=strs[0];
        String m=strs[strs.length-1];
        int ans=0;
        String result="";

        while(ans<n.length()){
            if(n.charAt(ans)==m.charAt(ans)){
                result=result+n.charAt(ans);
            }else{
                return result;
            }
            ans++;
        }
        return result;
        
    }
}