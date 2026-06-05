class Solution {
    public List<Integer> majorityElement(int[] nums) {
    List<Integer> list=new ArrayList<>();
    Map<Integer, Integer> map=new HashMap<>();
    for(int i=0; i<nums.length; i++){
        map.put(nums[i], map.getOrDefault(nums[i],0)+1);
      } 
      Integer limit=nums.length/3;
     for(Integer i:map.keySet()){
      if(map.get(i)>limit){
        list.add(i);
      }
     }
     return list;
    }
}