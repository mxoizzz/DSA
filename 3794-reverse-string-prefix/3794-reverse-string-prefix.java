class Solution {
    public String reversePrefix(String s, int k) {
        char[] str = s.toCharArray();
        int i = 0,
            j = k-1;
        
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