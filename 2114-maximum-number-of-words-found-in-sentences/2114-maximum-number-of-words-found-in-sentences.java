class Solution {
    public int mostWordsFound(String[] sentences) {
        int max = 0;
        for(String str:sentences){
        int count = 1;
        int i =0;
            while(i<str.length()){
                if(str.charAt(i) == ' '){
                    count++;
                }
                i++;
            }
            if(count>max){max = count;}
        }
        return max;
    }
}