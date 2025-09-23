class Solution {
    public int findSubstring(String s, String p) {
        int n = s.length();
        int m = p.length();
        
        // Traverse s till there's enough room for p
        for (int i = 0; i <= n - m; i++) {
            int j;
            for (j = 0; j < m; j++) {
                if (s.charAt(i + j) != p.charAt(j)) {
                    break;
                }
            }
            if (j == m) {
                return i; // found at index i
            }
        }
        return -1; // not found
    }
}
