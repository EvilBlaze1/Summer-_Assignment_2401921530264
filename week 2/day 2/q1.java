class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxLen = 0;

        for (int i = 0; i < s.length(); i++) {
            boolean[] visited = new boolean[128];

            for (int j = i; j < s.length(); j++) {
                char ch = s.charAt(j);

                if (visited[ch]) {
                    break;
                }

                visited[ch] = true;
                maxLen = Math.max(maxLen, j - i + 1);
            }
        }

        return maxLen;
    }
}