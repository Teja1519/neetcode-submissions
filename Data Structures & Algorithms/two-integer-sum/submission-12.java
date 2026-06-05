class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n=nums.length;
    //     for(int i=0; i<n; i++){
    //         for(int j=0; j<n; j++){
    //             if(i==j)continue;
    //           if(nums[i]+nums[i+1]==target){
    //             return new int[]{i, i+1};
    //           }
    //             if(nums[i]+nums[j]==target){
    //                  return new int[]{i,j};
    //             } 
    //         }
    //     }
    //     return new int[]{};
    // }
  Map<Integer, Integer> map=new HashMap<>();
  for(int i=0; i<nums.length; i++){
    int key=target-nums[i];
    if(map.containsKey(key)){
        return new int[] {map.get(key), i};
    }
    map.put(nums[i], i);
  }
   return new int[] {};

 }
}
