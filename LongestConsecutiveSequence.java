class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0)
            return 0;
        
        HashSet<Integer> set = new HashSet<>();
        for(int n : nums){
            set.add(n);
        }

        int count1 = 0;

        for(int n : set){
            if(!set.contains(n - 1)){
                int num = n;
                int count2 = 1;

                while(set.contains(num + 1)){
                    num++;
                    count2++;
                }
                count1 = Math.max(count1, count2);
            }   
        }
        return count1;
    }
}
