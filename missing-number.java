// sum of n numbers = n*(n-1)/2
//required number is sum - (sum of elements in array)
class Solution {
    public int missingNumber(int[] nums) {
        int sum = (nums.length*(nums.length + 1))/2;
        for(int i=0;i<nums.length;i++)
            sum = sum - nums[i];
        return sum; 
    }
}
