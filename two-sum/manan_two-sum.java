import java.util.HashMap;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>(); // tc = 1

        for (int i = 0; i < nums.length; i++) { // tc = n
            int current = nums[i]; // tc = n
            int complement = target - current; //tc = n

            if (map.containsKey(complement)) { //tc = n * log(n)
                return new int[]{ map.get(complement), i }; //tc = n * log(n)
            }

            map.put(current, i);//tc = n
        }

        return new int[]{}; //tc = 1
    }
}

// time: O(nlogn)
//space: O(n)