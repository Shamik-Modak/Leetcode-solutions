class Solution {
    public int singleNonDuplicate(int[] nums) {
        int low=0,high=nums.length-1;
        while(low<high){
            int mid=low+(high-low)/2;
            boolean isCorrectPair=(mid%2==0 && nums[mid]==nums[mid+1])||(mid%2==1 && nums[mid]==nums[mid-1]);
            if(isCorrectPair){
                low=mid+1;
            }
            else{
                high=mid;
            }
            
        }
        return nums[low];
    }
}