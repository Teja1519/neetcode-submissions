class Solution {
    public boolean checkInclusion(String s1, String s2) {
      int wSize=s1.length();
      int left=0;
      boolean isEqual=false;
      char[] arr1=s1.toCharArray();
        Arrays.sort(arr1);
      for(int right=0; right<s2.length(); right++){

        
        
    
       
        if(right-left+1==wSize){
            String str=s2.substring(left, right+1);
              char[] arr2=str.toCharArray();
        Arrays.sort(arr2);
          
       isEqual=Arrays.equals(arr1,arr2);
         if(isEqual)return isEqual;
            left++;
        }
      
      }
        return isEqual;  
    }
}
