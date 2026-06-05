class Solution {
    public boolean hasDuplicate(int[] nums) {
        // for(int i=0; i<nums.length; i++){
        //     int count=0;
        //     for(int j=0; j<nums.length; j++){
        //         if(nums[i]==nums[j])
        //         count++;
        //     }
        //     if(count>=2){
        //         return true;
        //     }
          
        // }
        // return false;

        Set<Integer> set=new HashSet<>();


        for(int i=0; i<nums.length; i++){
            if(set.contains(nums[i])){
                return true;
            }
            set.add(nums[i]);
        }
        return false;

    }

}