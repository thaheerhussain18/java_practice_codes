class Solution {
    public int findClosestNumber(int[] nums) {
        int small = nums[0];
        for(int n:nums){
            if(Math.abs(n)<Math.abs(small)){
                small=n;
            }
        }
        if(small<0 && contains(nums,Math.abs(small))){
            return Math.abs(small);
        }
        return small;
    }
    public boolean contains(int[]nums,int n){
        for(int m:nums){
            if(m==n){
                return true;
            }
        }
        return false;
    }
}
