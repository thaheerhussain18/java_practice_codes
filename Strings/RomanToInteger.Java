import java.util.HashMap;
import java.util.Map;

class Solution {
    public int romanToInt(String s) {
        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('M', 1000);
        map.put('D', 500);
        map.put('C', 100);
        map.put('L', 50);

        int out = 0;
        int n = s.length();
        int i = 0;
        while (i < n) {
            int curVal = map.get(s.charAt(i));
            if (i < n - 1) {
                int nextVal = map.get(s.charAt(i + 1));
                if (curVal < nextVal) {
                    out += nextVal - curVal;
                    i += 2;
                } else {
                    out += curVal;
                    i += 1;
                }
            } else {
                out += curVal;
                i += 1;
            }
        }
        return out;
    }
}
