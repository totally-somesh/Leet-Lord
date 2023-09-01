class Solution {
    public int compress(char[] chars) {

    int j = 0;    
    int count = 1;
    for(int i=1; i<=chars.length; i++){
        count = 1;
        while(i<chars.length && chars[i] == chars[i-1]){
            
            count++;
            i++;
        }      

        chars[j++] = chars[i-1];

        if(count > 1){

            String s = String.valueOf(count);
            
            for(char c : s.toCharArray()){
            chars[j++] = c;
            }
        }   
    }

    return j;
    }
}
