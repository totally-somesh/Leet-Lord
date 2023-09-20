class Solution {
    public double findMaxAverage(int[] nums, int k) {
        
        int sum = 0;
        int maxSum = -2147483647;

        for(int i=0; i<=nums.length-k; i++){

            for(int j=i; j<=i+k-1; j++){

                sum += nums[j];
            }

            maxSum = Math.max(maxSum, sum);
            sum = 0;
        }

        return (double)maxSum/k;      
    }
}
