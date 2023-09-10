class Solution {
    public int firstUniqChar(String s) {
        
        for(int i=0; i<s.length(); i++){

            char character = s.charAt(i); 
            int index = s.indexOf(character);
            int lastIndex = s.lastIndexOf(character);

            if(index == lastIndex){

                return index;
            }
        }

        return -1;
    }
}
