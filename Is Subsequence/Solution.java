class Solution {
    public boolean isSubsequence(String s, String t) {
        
        char [] strS = s.toCharArray();
        char [] strT = t.toCharArray();
        
        char [] check = new char [strS.length];

        if(s.isEmpty()){

            return true;
        }

        int j = 0;

        for(int i=0; i<strT.length; i++){
            
            if(j > strS.length-1){

                break;
            }

            
            if(strT[i] == strS[j]){

                check[j] = strT[i];
                j++;
            }            
        }

        if(j > strS.length-1 && Arrays.equals(check,strS)){
        return true;
        }
        else{
            return false;
        }
    }
}
