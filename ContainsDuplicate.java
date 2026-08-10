class Solution {
    public boolean hasDuplicate(int[] nums) {
        java.util.HashSet<Integer> unique = new java.util.HashSet<>();
        for(int x:nums){
            if(unique.contains(x))
                return true;
            unique.add(x);
        }
        return false;
    }
}
