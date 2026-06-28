class Solution {
    public int bSearch(int[] arr, int low, int high, int x){
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]==x) return mid;
            if(arr[mid]<x) low=mid+1;
            else high=mid-1;
        }
        return low;  
    }
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
       List<Integer> ans=new ArrayList<>();
        if(x<arr[0]){
            return Arrays.stream(arr).limit(k).boxed().collect(Collectors.toList());
        }else if(x>arr[arr.length-1]){
            return Arrays.stream(arr).skip(arr.length-k).boxed().collect(Collectors.toList());
        }
 int i = bSearch(arr, 0, arr.length - 1, x);

        int left = i - 1;
        int right = i;

        while (ans.size() < k) {

            if (left < 0) {
                ans.add(arr[right++]);
            }
            else if (right >= arr.length) {
                ans.add(arr[left--]);
            }
            else if (Math.abs(x - arr[left]) <= Math.abs(x - arr[right])) {
                ans.add(arr[left--]);
            }
            else {
                ans.add(arr[right++]);
            }
        }

        Collections.sort(ans);
        return ans;
        
    }
}