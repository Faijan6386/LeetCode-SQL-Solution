import java.util.*;

class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int n1 = s1.length();
        int n2 = s2.length();
        
        if (n1 > n2) return false;
        
        int f1[] = new int[26]; // freq for s1
        int f2[] = new int[26]; // freq for window in s2
        
        for (char c : s1.toCharArray()) {
            f1[c - 'a']++;
        }
        
        int i = 0, j = 0;
        while (j < n2) {
            char c = s2.charAt(j);
            f2[c - 'a']++;
            
            if (j - i + 1 < n1) {
                j++;
            } 
            else if (j - i + 1 == n1) {
                if (Arrays.equals(f1, f2)) {
                    return true;
                }
                j++;
            } 
            else {
                while (j - i + 1 > n1) {
                    f2[s2.charAt(i) - 'a']--;
                    i++;
                }
                if (Arrays.equals(f1, f2)) {
                    return true;
                }
                j++;
            }
        }
        return false;
    }
}
