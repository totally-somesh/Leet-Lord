class Solution {
    public String gcdOfStrings(String str1, String str2) {

        char [] charArr2 = str2.toCharArray();        

        String str = new String();
        str = str + charArr2[0];

        char start = charArr2[0];

        for(int i=1; i<charArr2.length; i++){

            if(charArr2[i] == start)
                break;           

            if(charArr2[i] != start)
                str = str + charArr2[i];
        }

        if(!str1.contains(str))
            return new String("");
            

        return str;
    }
}
