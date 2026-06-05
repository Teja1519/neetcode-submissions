class Solution {
    public int majorityElement(int[] nums) {
      HashMap<Integer, Integer> map=new HashMap<>();
      List<Integer> list=new ArrayList<>();
      for(int i=0; i<nums.length; i++){
        map.put(nums[i],map.getOrDefault(nums[i],0)+1);
      } 
      Integer max=0; 
      int ans=0;
     for(Integer i: map.keySet()){
       if(map.get(i)>max){
        max=map.get(i);
        ans=i.intValue();
       }
     }
 
    
     return ans;
    }
}