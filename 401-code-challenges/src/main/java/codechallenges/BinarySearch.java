package codechallenges;

public class BinarySearch {
    public int binarySearch(int[] nums, int target){
        if(nums == null || nums.length == 0){
            return -1;
        }

        int start = 0, end = nums.length - 1;
        while(start <= end){
            int mid = (start + end)/2;
            if(nums[mid] == target){
                return mid;
            }
            if (nums[mid] < target){
                start = mid + 1;
            }
            if (nums[mid] > target){
                end = mid - 1;
            }
        }
        return -1;
    }
}
