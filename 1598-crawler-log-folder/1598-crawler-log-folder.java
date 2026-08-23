class Solution {
    public int minOperations(String[] logs) {
        int dis=0;
        for(String log:logs){
            if(log.equals("../")){
                if(dis>0){
                    dis--;
                }
            }
            else if(!log.equals("./")){
                dis++;
            }
        }
        return dis;

        // Stack<String> ops = new Stack<>();
        // for(String log : logs) {
        //     if(!log.equals("../")) {
        //         if(!log.equals("./")) {
        //             ops.push(log);
        //             continue;
        //         }
        //         else{
        //             continue;
        //         }
        //     }
        //     if(!ops.isEmpty()) {
        //         ops.pop();
        //     }
        // }
        // return ops.size();
    }
}