class Solution {
    public int longestSubarray(int[] nums) {

        int current = 0;
        int previous = 0;
        int answer = 0;
        boolean zeroFlag = false;

        for(int i : nums){

            if(i == 1){

                current++;
            }else{

                answer = Math.max(answer, current + previous);
                previous = current;
                current = 0;   
                zeroFlag = true;         
            }
        }

        answer = Math.max(answer, current + previous);

      if(zeroFlag){

          return answer;
      }else{

          return answer-1;
      }
    }
}
