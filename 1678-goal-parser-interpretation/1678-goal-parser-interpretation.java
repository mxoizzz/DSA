class Solution {
    public String interpret(String command) {
        String parse = "";
        int i =0;
        while(i<command.length()){
            if(command.charAt(i) == 'G'){
                parse += "G";
                i+=1;
            }
            else if(command.charAt(i) == '(' && command.charAt(i+1) == ')'){
                parse += "o";
                i+=2;
            }
            else{
                if(command.charAt(i+1) == 'a'){
                    parse += "al";
                }
                    i+=2;
            }
        }
        return parse;
    }
}