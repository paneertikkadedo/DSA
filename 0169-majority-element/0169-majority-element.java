class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length/2;
        int answer = 0;
        HashMap<Integer,Integer> freq = new HashMap<>();
        for(int num : nums){
            freq.put(num,freq.getOrDefault(num,0)+1);
        }

        for(int key : freq.keySet()){
            if(freq.get(key)>n){
                answer = key;
            }
        }
    return answer;
    }
}