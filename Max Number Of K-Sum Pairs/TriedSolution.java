class Solution {
    public int maxOperations(int[] nums, int k) {

        int operations = 0;
        int sum = 0;

        for(int i=0; i<nums.length; i++){

            for(int j=i+1; j<nums.length; j++){

                sum = nums[i] + nums[j];

                if(sum == k && nums[i] != 0 && nums[j] != 0){

                    nums[i] = 0;
                    nums[j] = 0;
                    operations++;
                    
                }                
            }
        }

            for(int o: nums){
            System.out.println(o);          
            }

            return operations; 
        }


    }
