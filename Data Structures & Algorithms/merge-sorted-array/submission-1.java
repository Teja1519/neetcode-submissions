class Solution {
    public void insert(int[] arr, int a, int idx){
            int temp = a;

    while (idx < arr.length) {
        int curr = arr[idx];
        arr[idx] = temp;
        temp = curr;
        idx++;
    }
    }
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = 0;
        int j = 0;

        while (i < m && j < n) {

            if (nums2[j] < nums1[i]) {
                insert(nums1, nums2[j], i);
                j++;
                m++; 
                i++;
            } else {
                i++;
            }
        }

        while (j < n) {
            nums1[m++] = nums2[j++];
        }
    }
}