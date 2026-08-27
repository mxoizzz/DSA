class Solution {
    public int findClosest(int x, int y, int z) {
        int distX = Math.abs(x - z);
        int distY = Math.abs(y - z);
        
        if (distX == distY) {
            return 0; 
        }
        
        return (distX < distY) ? 1 : 2; 
    }
}