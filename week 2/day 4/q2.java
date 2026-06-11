class Solution {
    int idx = 0;

    public String decodeString(String s) {
        StringBuilder result = new StringBuilder();

        while (idx < s.length() && s.charAt(idx) != ']') {

            char ch = s.charAt(idx);

            if (Character.isLetter(ch)) {
                result.append(ch);
                idx++;
            } else {
                int num = 0;

                while (Character.isDigit(s.charAt(idx))) {
                    num = num * 10 + (s.charAt(idx) - '0');
                    idx++;
                }

                idx++; // skip '['

                String decoded = decodeString(s);

                idx++; // skip ']'

                for (int i = 0; i < num; i++) {
                    result.append(decoded);
                }
            }
        }

        return result.toString();
    }
}