class Solution {
    public void reverse(int start, int last, int [] nums){
        while(start<last){
            int temp=nums[start];
            nums[start]=nums[last];
            nums[last]=temp; 
            start++;
            last--;      
        }
        
    }
    public void rotate(int[] nums, int k) {
        if(nums.length==k){
            return;
        }
        reverse(0, nums.length-1, nums);
        reverse(0, (k%nums.length)-1, nums);
        reverse(k%nums.length, nums.length-1, nums);

    }
}