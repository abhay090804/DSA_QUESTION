class Solution {
    public int search(int[] nums, int target) {

        int left = 0;
        int n=nums.length-1;
        int right=n;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                return mid;
            }
            if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }
}