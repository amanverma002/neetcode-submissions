class Solution {
    public boolean isAnagram(String s, String t) {

        char[] arr1=s.toCharArray();
        char[] arr2=t.toCharArray();

        int[] freq=new int[26];

        for(int i=0;i<arr1.length; i++){
            int idx=arr1[i]-'a';
            freq[idx]=freq[idx]+1;

        }
          for(int i=0;i<arr2.length; i++){
            int idx=arr2[i]-'a';
            freq[idx]=freq[idx]-1;

    }

    for(int i=0;i<26;i++){
        if(freq[i]!=0){
            return false;
        }
    }
    return true;
}

    }
