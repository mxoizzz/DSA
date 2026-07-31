class Solution {
    public String reversePrefix(String word, char ch) {
        int j = word.indexOf(ch);

        if(j == -1){
            return word;
        }

        char[] str = word.toCharArray();
        int i = 0;
        
        while(i<j){
            char temp = str[i];
            str[i] = str[j];
            str[j] = temp;
            i++;
            j--;
        }

        return new String(str);
    }
}