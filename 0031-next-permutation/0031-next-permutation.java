class Solution {
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        int pivot = -1;
        for(int i=n-1; i>0; i--){
            if(nums[i]>nums[i-1]){
                pivot = i-1;
                break;
            }
        }
        int nextGreatestThanPivot = -1;
        if(pivot!= -1){
            for(int i=n-1; i>pivot; i--){
                if(nums[i]>nums[pivot]){
                    nextGreatestThanPivot = i;
                    break;
                }
            }

            // swap the pivot and nextGreatestThanPivot 
            int temp = nums[pivot];
            nums[pivot] = nums[nextGreatestThanPivot];
            nums[nextGreatestThanPivot] = temp;
        }

        // reverse the numbers after pivot
        int left = pivot + 1;
        int right = n - 1;
        while (left < right) {
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right--;
        }
    }
}