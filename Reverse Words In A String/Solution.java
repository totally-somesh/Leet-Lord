class Solution {
    public String reverseWords(String s) {
        
        String splittedStr = s.replaceAll("\\s+", " ");

        String [] splittedStrArr = splittedStr.split(" ", 0);

        Collections.reverse(Arrays.asList(splittedStrArr));

        return String.join(" ", splittedStrArr).strip();  

    }
}
