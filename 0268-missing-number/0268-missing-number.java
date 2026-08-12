class Solution {
    public int missingNumber(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int n = nums.length;
        int sumUptoN = (n*(n+1))/2;
        int sumOfNums = 0;
        for(int num : nums){
            sumOfNums = sumOfNums + num;
        }
        int ans = sumUptoN - sumOfNums;
        return ans;
    }
}