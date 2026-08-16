class Solution {
    public int majorityElement(int[] nums) {
        // moore's voting algo
        int candidate = nums[0];
        int votes = 0;
        for(int i=0; i<nums.length; i++){
            if(candidate == nums[i]){
                votes++;
            }
            else if (votes == 0){
                candidate = nums[i];
            }
            else{
                votes--;
            }
        }
    return candidate;
    }
}