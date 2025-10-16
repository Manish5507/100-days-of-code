public class  insertsort {
    public int searchInsert(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] >= target) {
                return i;
            }
        }
        return nums.length; // if target is greater than all elements
    }

    public static void main(String[] args) {
        insertsort sorter = new insertsort();
        int[] nums = {1, 3, 5, 6};
        int target = 5;
        int result = sorter.searchInsert(nums, target);
        System.out.println("The target should be inserted at index: " + result);
    }
}

