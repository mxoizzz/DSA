class Solution {
    public int minOperations(String[] logs) {
        Stack<String> ops = new Stack<>();
        for(String log : logs) {
            if(!log.equals("../")) {
                if(!log.equals("./")) {
                    ops.push(log);
                    continue;
                }
                else{
                    continue;
                }
            }
            if(!ops.isEmpty()) {
                ops.pop();
            }
        }
        return ops.size();
    }
}