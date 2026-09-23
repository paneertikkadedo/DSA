class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int n = arr.length;
        int start = 0;
        int end = n-1;
        int ans = -1;

        while(start <= end){
            int mid = start + (end-start)/2;

            if(arr[mid] < arr[mid+1]){
                // mtlb  m left part m hu 
                // mujhe pta h ki answer right part m h to right m move kr jaoo
                start = mid+1;
            }

            else{
                // arr[mid] > arr[mid+1]
                // answer isi part m h ik but there could be a case of potential answer then mujhe check krna pdega ki mere s phle jo element h khi vo to nhi badaa h mere se 
                ans = mid ;

                // pichla element check krne k liye right part m left m move kro 
                end = mid-1;
            }
        }
    return ans;
    }
}
