class Solution {
    public boolean isAnagram(String s, String t) {
        return(java.util.Arrays.equals(counter(s),counter(t)));
    }
    private int[] counter(String s){
        int[] count = new int[26];
        for(char c : s.toCharArray()){
            count[ c-'a']++;
        }
        return count;
    }
}
