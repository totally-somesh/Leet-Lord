class Solution {
    public String reverseVowels(String s) {

       Stack<Character> stck = new Stack<>();
                     
       char [] charArr = s.toCharArray(); 
              
       for(int i=0; i<charArr.length; i++){

           if(charArr[i] == 'a' || charArr[i] == 'A' || charArr[i] == 'e' || charArr[i] == 'E' || charArr[i] == 'i' || charArr[i] == 'I' || charArr[i] == 'o' || charArr[i] == 'O' || charArr[i] == 'u' || charArr[i] == 'U'){

               stck.push(charArr[i]);
           }
       }

        for(int i=0; i<charArr.length; i++){

if(charArr[i] == 'a' || charArr[i] == 'A' || charArr[i] == 'e' || charArr[i] == 'E' || charArr[i] == 'i' || charArr[i] == 'I' || charArr[i] == 'o' || charArr[i] == 'O' || charArr[i] == 'u' || charArr[i] == 'U'){
    
           if (!stck.isEmpty()) {
            charArr[i] = stck.pop();
        }
           }
       }

       String str = new String(charArr);
       return str;
    }
}
