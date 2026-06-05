class Solution {
    public int subarraySum(int[] nums, int k) {
        int count=0;
        for(int i=0 ;i <nums.length; i++){
          int cSum=0;
          for(int j=i; j<nums.length; j++){
            cSum+=nums[j];
            if(cSum==k){
              count++;
            }
          }
        }
        return count;
    }
}