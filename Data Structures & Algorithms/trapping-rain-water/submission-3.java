class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int count=0;
        int left=0;
        int right=people.length-1;
        while(left<right){
            if(people[left]==limit){
                count++;
                left++;
            }
            else if(people[right]==limit){
                count++;
                right--;
            }
            else if(people[left]+people[right]<=limit){
                count++;
                left++;
                right--;
            }else if(people[left]+people[right]>limit){
                count++;
                right--;
            }
            else{
                count=count+2;
                left++;
                right--;
            }
        }
        if(left==right){
            if(people[left]<=limit){
                count++;
            }
        }
        return count;
    }
}