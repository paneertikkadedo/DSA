class Solution {
    public int maxProduct(int[] nums) {
    //     int n = nums.length;
    //     int maxProduct = Integer.MIN_VALUE;
    //     for(int i=0; i<n; i++){
    //         int product = 1;
    //         for(int j=i; j<n; j++){
    //             product*=nums[j];
    //             maxProduct = Math.max(maxProduct,product);
    //         }
    //     }
    // return maxProduct;

    // approach 2 prefix and suffix
     int n = nums.length;
        int prefix = 1;
        int suffix = 1;
        int maxProduct = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {

            if (prefix == 0) {
                prefix = 1;
            }

            if (suffix == 0) {
                suffix = 1;
            }

            prefix *= nums[i];
            suffix *= nums[n - 1 - i];

            maxProduct = Math.max(maxProduct, Math.max(prefix, suffix));
        }

        return maxProduct;
    }
}