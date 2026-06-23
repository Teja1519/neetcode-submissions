class Solution {
    public int characterReplacement(String s, int k) {
        // HashMap<Character, Integer> map=new HashMap<>();
        // char[] arr=s.toCharArray();
        // int count=0;
        // int wSize=2;
        // int left=0;
        // int i=0;
        // while(i<arr.length-1){
        //     map.put(arr[i], map.getOrDefault(arr[i],0)+1);
        //     i++;
        // }
        // if(map.size()==1){
        //     return arr.length;
        // }
        // for(int right=0; right<s.length(); right++){
        //      if(arr[left]!=arr[right] && k>0){
        //         left++;
        //         count++;
        //    }
        //    else{
        //          Character minChar=Collections.min(map.entrySet(), Map.Entry.comparingByValue()).getKey();
        //          if(arr[left]==minChar){
        //             arr[left]=arr[right];
        //          }else{
        //             arr[right]=arr[left];
        //          }
        //    }
        //     if(right-left>=wSize){
        //         left++;
        //         count++;
        //     }


        // }
        // return count+2;

        int[] freq = new int[26];

        int left = 0;
        int maxFreq = 0;
        int maxLength = 0;

        for (int right = 0; right < s.length(); right++) {

            freq[s.charAt(right) - 'A']++;

            maxFreq = Math.max(maxFreq, freq[s.charAt(right) - 'A']);

            while ((right - left + 1) - maxFreq > k) {
                freq[s.charAt(left) - 'A']--;
                left++;
            }

            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }
}

