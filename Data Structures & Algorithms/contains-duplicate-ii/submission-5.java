class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        // for(int i=1; i<=nums.length-k-1; i++){
        //     int x=1;
        //     for(int j=x; j<=j+k; j++){
        //         if(i==j){
        //             continue;
        //         }
        //         if(nums[i]==nums[j]){
        //             return true;
        //         }
        //     }
        // }
        // int sum=0;
        // while(true){
        // for(int i=0; i<k; i++){
        //     cSum+=nums[i];
        // }
        // int pSum=cSum;
        // if(pSum==cSum){
        //     return true;
        // }
        // }
        // return false;
        HashSet<Integer> set=new HashSet<>();
        int left=0;
        for(int right=0; right<nums.length; right++){
            if(set.contains(nums[right])){
                return true;
            }
            set.add(nums[right]);
            if(right-left>=k){
                set.remove(nums[left]);
                left++;
            }

        }
        return false;
    }
}