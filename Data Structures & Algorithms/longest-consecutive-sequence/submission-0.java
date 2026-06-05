class Solution {
    HashSet<Integer> set=new HashSet<>();
 
    public int longestConsecutive(int[] nums) {
        List<Integer> list=new ArrayList<>();
        for(int i=0; i<nums.length; i++){
            set.add(nums[i]);
        }
        int n=nums.length;
        int lnth=0;
        int max=0;
        for(int i=0; i<nums.length; i++){
            if(set.contains(nums[i]-1))continue;
           lnth=lnthOfSqnce(nums[i], n);
           if(lnth>max)max=lnth;
        }
        
        // for(Integer i:list){
        //     if(i>max)
        //     max=i;
        // }
        return max;

    }
    public int lnthOfSqnce(int a, int size){
       int count=1;   
     for(int i=0; i<size; i++){
       if( set.contains(++a)){
        count++;
       }else
       return count;
     } 
     return count;  
    }
}
