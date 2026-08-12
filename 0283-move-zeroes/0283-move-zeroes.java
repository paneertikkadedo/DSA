class Solution {
    public void moveZeroes(int[] nums) {
        // brute force 
        // List<Integer> temp = new ArrayList<>();
        // int n = nums.length;
        // // adding non zero elements to temp
        // for(int i=0; i<n; i++){
        //     if(nums[i]!=0){
        //         temp.add(nums[i]);
        //     }
        // }
        // int nz = temp.size();

        // // move the non zero elements to the starting of the array
        // for(int i=0; i<nz; i++){
        //     nums[i]=temp.get(i);
        // }

        // // add all the left out elements(0) to the end of array
        // for(int i=nz; i<n; i++){
        //     nums[i]=0;
        // }


        // optimal approach-- twp pointers
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j++;
            }
        }

    }
}