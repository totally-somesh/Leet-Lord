class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        int [] answer = new int [nums.length];
        int multiplication = 1;

        for(int i=0; i<nums.length; i++){

            for(int j=0; j<nums.length; j++){

                if(i == j){
                    continue;
                }
                else
                    multiplication *= nums[j]; 
            }
            answer[i] = multiplication;
            multiplication = 1;
        }
        return answer;
    }
}
