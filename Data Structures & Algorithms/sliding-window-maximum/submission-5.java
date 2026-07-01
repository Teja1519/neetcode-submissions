// class Solution {
//     public int[] maxSlidingWindow(int[] nums, int k) {
//         List<Integer> ans=new ArrayList<>();
//         int left=0;
//            int max=0;
//         for(int right=0; right<nums.length; right++){
//                if(right-left>=k){
//                 ans.add(max);
//                 left++;
//             }
//             if(nums[right]>max){
//                 max=nums[right];
//             }

         
//         }
        
//         return ans.stream().mapToInt(Integer::intValue).toArray();
//     }
// }
// [6:21 am, 01/07/2026] D6_96643_Tejeswar: ee test case lo fail avtundhii
class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        List<Integer> ans=new ArrayList<>();
        int left=0;
           
        for(int right=0; right<nums.length; right++){
            int max=Integer.MIN_VALUE;
            for(int i=left; i<=right; i++){
                
                if(max<nums[i])
                    max=nums[i];
            }
            if(right-left+1>=k){
                ans.add(max);
                left++;
            }
            
        }
       
        
        return ans.stream().mapToInt(Integer::intValue).toArray();
    }
}