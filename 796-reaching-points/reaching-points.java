class Solution {
    public boolean reachingPoints(int sx, int sy, int tx, int ty) {
        while(sx < tx && sy < ty){
            if(tx > ty){
                 tx %= ty;
            }else {
                ty %= tx;
            }
        }

        if(sx == tx && sy <= ty && (ty - sy) % tx == 0) return true;
        if(sy == ty && sx <= tx && (tx - sx) % ty == 0) return true;
        return false;
    }
}
