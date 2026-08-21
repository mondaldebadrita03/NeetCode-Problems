//Brute Force Approach

class Solution {
    public int[] twoSum(int[] numbers, int target) {
        for(int i = 0; i < numbers.length - 1; i++){
            int j = i + 1;
            while(j < numbers.length && numbers[i] + numbers[j] != target){
                j++;
            }
            if(j < numbers.length && numbers[i] + numbers[j] == target)
                return new int[] {i+1, j+1};
        }
        return new int[] {-1, -1};
    }
}


//Optimal solution

class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1;
        
        while (left < right) {
            int currentSum = numbers[left] + numbers[right];
            if (currentSum == target) {
                return new int[] {left + 1, right + 1}; 
            } else if (currentSum < target) {
                left++;
            } else {
                right--;
            }
        }
        
        return new int[] {-1, -1};
    }
}
