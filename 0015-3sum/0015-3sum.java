import java.util.*;
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
    //     int n = nums.length;
    //     HashSet<List<Integer>> ans = new HashSet<>();
    //     for(int i=0; i<n; i++){
    //         for(int j=i+1; j<n; j++){
    //             for(int k=j+1; k<n; k++){
    //                 if(nums[i]+nums[j]+nums[k]==0){
    //                     List<Integer> triplets = new ArrayList<>();
    //                     triplets.add(nums[i]);
    //                     triplets.add(nums[j]);
    //                     triplets.add(nums[k]);
    //                     Collections.sort(triplets);
    //                     ans.add(triplets);
    //                 }
    //             }
    //         }
    //         // to remove the duplicates 
    //     }
    // return new ArrayList<>(ans);
       List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 2; i++) {
            if (i > 0 && nums[i] == nums[i - 1])
                continue;
            int left = i + 1;
            int right = nums.length - 1;
            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];

                if (sum == 0) {
                    ans.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    left++;
                    right--;
                    while (left < right && nums[left] == nums[left - 1])
                        left++;
                    while (left < right && nums[right] == nums[right + 1])
                        right--;
                } else if (sum < 0) {
                    left++;
                } else {
                    right--;
                }
            }
        }
        return ans;
    }
}