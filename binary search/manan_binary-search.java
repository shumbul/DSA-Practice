
class Solution {

    public int search(int[] nums, int target) {
        int left = 0; //tc = 1
        int right = nums.length - 1; //tc = 1

        while (left <= right) {
            int mid = left + (right - left) / 2; //tc = n

            if (nums[mid] == target) { //tc = n
                return mid;
            } else if (nums[mid] < target) { //tc = n
                left = mid + 1;
            } else { //tc = n
                right = mid - 1;
            }
        }

        return -1; //tc = 1
    }
}
//time complexity : O(logn );
