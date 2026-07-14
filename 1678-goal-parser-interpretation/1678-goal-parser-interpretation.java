class Solution {
    public String interpret(String command) {
        StringBuilder parse = new StringBuilder();
        int i =0;
        while(i<command.length()){
            if(command.charAt(i) == 'G'){
                parse.append('G');
                i+=1;
            }
            else if(command.charAt(i+1) == ')'){
                parse.append('o');
                i+=2;
            }
            else{
                parse.append("al");
                i+=4;
            }
        }
        return parse.toString();
    }
}