class Solution {
    public int lengthOfLongestSubstring(String s) {
        char[] str=s.toCharArray();
        int left=0;
        int maxLen=0;
         HashSet<Character> set=new HashSet<>();
        for(int right=0; right<str.length; right++){
           
           
            while(set.contains(str[right])){
                set.remove(str[left]);
                left++;     
            }
            set.add(str[right]);
             maxLen = Math.max(maxLen, right - left + 1);
        }
        return maxLen;
    }
}
