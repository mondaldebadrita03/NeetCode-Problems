class Solution {
    public int characterReplacement(String s, int k) {

        int[] freq = new int[26];

        int left = 0;
        int maxFreq = 0;
        int maxLength = 0;

        for (int right = 0; right < s.length(); right++) {

            // Add current character to the window
            freq[s.charAt(right) - 'A']++;

            // Update frequency of most common character
            maxFreq = Math.max(maxFreq, freq[s.charAt(right) - 'A']);

            // If more than k replacements are required
            while ((right - left + 1) - maxFreq > k) {

                freq[s.charAt(left) - 'A']--;
                left++;
            }
            // Update answer
            maxLength = Math.max(maxLength, right - left + 1);
        }
        return maxLength;
    }
}
