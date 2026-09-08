class Solution {
    public String minWindow(String s, String t) {
        if (s.length() < t.length()) {
            return "";
        }
        int[] need = new int[128];
        int[] have = new int[128];
        for (char c : t.toCharArray()) {
            need[c]++;
        }
        int left = 0;
        int count = 0;
        int  minLength= Integer.MAX_VALUE;
        int start = 0;
        for (int right = 0; right < s.length(); right++) {
            char c = s.charAt(right);
            have[c]++;
            if (need[c] > 0 && have[c] <= need[c]) {
            count++;
            }
            while (count == t.length()) {
                if (right - left + 1 < minLength) {
                    minLength = right - left + 1;
                    start = left;
                }
                char leftChar = s.charAt(left);
                have[leftChar]--;
                if (need[leftChar] > 0 &&
                    have[leftChar] < need[leftChar]) {
                    count--;
                }
                left++;
            }
        }
        if (minLength == Integer.MAX_VALUE) {
            return "";
        }
        return s.substring(start, start + minLength);
    }
}
