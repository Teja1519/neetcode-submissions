class Solution {
    public int removeElement(int[] nums, int val) {
    int s=nums.length;
    int i=0;
    while(i<s){
      if(nums[i]==val){
        delete(nums, i, s);
        s--;
      }
      else{
        i++;
      }
    }
    return s; 
     

    
    }
    public void delete(int[]nums, int i, int size){
     while(i<size-1){
       nums[i]=nums[i+1];
       i++;
     }
    }
}