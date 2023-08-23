class Solution {
    public String mergeAlternately(String word1, String word2) {
        
        char [] charArr1 = word1.toCharArray();
        char [] charArr2 = word2.toCharArray();

        String str = new String();

        for(int i=0; i<charArr1.length + charArr2.length;i++){

            if(i<charArr1.length){

                str = str + charArr1[i];
            }

            if(i<charArr2.length){

                str = str + charArr2[i];
            }
        }
        return str;
    }
}
