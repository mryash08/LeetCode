import java.util.*;
class Solution {
    public boolean isPathCrossing(String path) {
       HashSet<String> set = new HashSet<>();
        int x=0; int y=0;
        for(int i=0; i<path.length(); i++){
            String s = String.valueOf(x) + "|"+String.valueOf(y);
            if(set.contains(s)) return true;
            else set.add(s);
            char p = path.charAt(i);
            if(p == 'N') x++;
            else if(p == 'E') y++;
            else  if(p == 'S') x--;
            else if(p == 'W') y--;
        }
        if(set.contains(String.valueOf(x) +"|"+ String.valueOf(y) )) return true;
        return false;
    }
}