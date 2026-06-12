class Solution {
    public boolean isPalindrome(char[] str, int left, int right){
            while(left<right){
                if(str[left]==str[right]){
                    left++;
                    right--;
                }else{
                    return false;
                }

            }
            return true;
    }
    public boolean validPalindrome(String s) {
        s=s.replaceAll("[^a-zA-Z0-9]","");

        char[] str=s.toCharArray();
        int a=0;
        int b=str.length-1;
        while(a<b){
            if(str[a]==str[b]){
                a++;
                b--;
            }else{
               return isPalindrome(str, a+1, b)||isPalindrome(str, a, b-1);
            }

            
        }
        return true;

    }
}