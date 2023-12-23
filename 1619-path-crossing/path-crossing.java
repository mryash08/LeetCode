import java.util.*;
class Solution {
    public boolean isPathCrossing(String path) {
       HashSet<Integer> set = new HashSet<>();
        int x=0; int y=0;
        for(int i=0; i<path.length(); i++){
            int s = (x * 10 + 1) * 10+ y;
            if(set.contains(s)) return true;
            else set.add(s);
            char p = path.charAt(i);
            if(p == 'N') x++;
            else if(p == 'E') y++;
            else  if(p == 'S') x--;
            else if(p == 'W') y--;
        }
        if(set.contains((x * 10 + 1)*10 + y)) return true;
        return false;
    }
}