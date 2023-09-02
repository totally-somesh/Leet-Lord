class Solution {
    public void moveZeroes(int[] nums) {
        
        int [] shadownum = new int [nums.length];

        for(int i=0; i<nums.length; i++){

            shadownum[i] = nums[i];
        }

        int j = 0;
        int end = nums.length-1;

        for(int i=0; i<shadownum.length; i++){

            if(shadownum[i] != 0){
                System.out.println(shadownum[i]);
                nums[j++] = shadownum[i];
            }
            else{
                nums[end--] = 0;
            }
        }
    }
}
