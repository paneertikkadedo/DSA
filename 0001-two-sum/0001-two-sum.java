    //    int n = nums.length;
    //    for(int i=0; i<n; i++){
    //         for(int j=i+1 ;j<n; j++){
    //             if(nums[i]+nums[j]==target){
    //                 int []ans = {i,j};
    //                 return ans;
    //             }
    //         }
    //    }
    //     int []ans = {};
    //     return ans;        
import java.util.*;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        // hashmap method 
        HashMap<Integer, Integer> map = new HashMap<>();
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            int numneed = target - nums[i];
            if (map.containsKey(numneed)) {
                int[] ans = {map.get(numneed), i};
                return ans;
            }
            map.put(nums[i], i);
        }
        int[] ans = {};
        return ans;
    }
}
