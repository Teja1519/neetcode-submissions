class Solution {
    public int maxArea(int[] heights) {
        int n=heights.length;
        int maxArea=0;
        // for(int i=0; i<n-1; i++){
        //     for(int j=i+1; j<n; j++){
        //         if(heights[i]==0){
        //             break;
        //         }
        //         int minHeight=heights[i]>heights[j]?heights[j]:heights[i];
        //         int area=minHeight*(j-i);
        //         if(area>maxArea){
        //         maxArea=area;
        //         }
        //     }
        // }
        int left=0;
        int right=n-1;
        while(left<right){
           
                int minHeight=heights[left]>heights[right]?heights[right]:heights[left];
                int area=minHeight*(right-left);
                if(area>maxArea){
                 maxArea=area;
                }
                 if(heights[left]<heights[right]){
                left++;
                 }
              
            else{
                right--;
            }
            
        }
        return maxArea;
    }
}
