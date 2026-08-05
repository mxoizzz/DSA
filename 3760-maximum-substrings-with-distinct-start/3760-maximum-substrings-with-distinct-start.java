class Solution {
    public int maxDistinct(String s) {
        HashSet<Character> distinct=new HashSet<>();
        for(int i=0;i<s.length();i++){
            distinct.add(s.charAt(i));
        }
        return distinct.size();
    }
}