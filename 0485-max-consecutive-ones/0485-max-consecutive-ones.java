class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int n = nums.length;
        int count_one = 0;
        int maxCount = 0;
        for(int i=0; i<n; i++){
            if(nums[i]==1){
                count_one++;
                maxCount = Math.max(maxCount, count_one);  
            }
            else if(nums[i]==0){
                count_one = 0;
            }
        }
        return maxCount;
    }
}