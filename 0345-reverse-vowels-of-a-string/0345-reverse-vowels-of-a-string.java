class Solution {
    public String reverseVowels(String s) {
        int left = 0;
        int right = s.length()-1;
        char[] chars = s.toCharArray();
        while(left<right){
            char c1 = Character.toLowerCase(chars[left]);
            char c2 = Character.toLowerCase(chars[right]);

            if(c1 == 'a' || c1 == 'e' || c1 == 'i' || c1 == 'o' || c1 == 'u'){
                if(c2 == 'a' || c2 == 'e' || c2 == 'i' || c2 == 'o' || c2 == 'u'){
                    char temp = chars[left];
                    chars[left] = chars[right];
                    chars[right] = temp;
                    left++;
                    right--;
                    continue;
                }
                right--;
                continue;
            }
            left++;
        }
        return new String(chars);
    }
}