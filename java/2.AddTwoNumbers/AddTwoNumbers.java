class Solution {
    public int[] twoSum(int[] nums, int target) {
        for(int first=0; first<=nums.length-2;first++){
            for(int second=first+1; second<=nums.length-1;second++){
            if(nums[first]+nums[second]==target){return new int[]{first,second};}
        }
        }
        return null;
    }
}