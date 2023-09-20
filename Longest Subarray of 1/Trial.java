class Trial {
    public int longestSubarray(int[] nums) {
        
        int size = 0;
        int oneElement = 2;
        int indexToRemove = 0;
        boolean onlyOne = true;

        for(int I : nums){

            if(I == 0){

                onlyOne = false;
            }
        }

        if(onlyOne){

            return nums.length - 1;
        }

        for(int i=0; i<nums.length; i++){

            if(i>= 1 && nums[i] == 0){

                oneElement--;
            }
            
            if(nums[i] == 1 && oneElement >= 1){

                size++;
            }            
        }

        return size;
    }
}
