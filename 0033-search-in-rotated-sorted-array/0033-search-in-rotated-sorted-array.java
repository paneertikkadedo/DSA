class Solution {
    public int search(int[] nums, int target) {
        int n = nums.length;
        int s = 0;
        int e = n - 1;

        while (s <= e) {

            int mid = s + (e - s) / 2;

            // target found
            if (nums[mid] == target) {
                return mid;
            }

            // Left half is sorted
            if (nums[s] <= nums[mid]) {

                // target lies in the sorted left half
                if (nums[s] <= target && target < nums[mid]) {
                    e = mid - 1;
                } 
                else {
                    s = mid + 1;
                }
            }

            // Right half is sorted
            else {

                // target lies in the sorted right half
                if (nums[mid] < target && target <= nums[e]) {
                    s = mid + 1;
                } 
                else {
                    e = mid - 1;
                }
            }
        }

        return -1;
    }
}