class Solution {
    public int findKthLargest(int[] nums, int k) {
        int target = nums.length - k;
        int left = 0, right = nums.length - 1;

        while (true) {
            int p = partition(nums, left, right);
            if (p == target) {
                return nums[p];
            } else if (p < target) {
                left = p + 1;
            } else {
                right = p - 1;
            }
        }
    }

    private int partition(int[] nums, int left, int right) {
        Random rand = new Random();
        int pivotIdx = left + rand.nextInt(right - left + 1);
        swap(nums, pivotIdx, right);
        int pivot = nums[right];
        int store = left;

        for (int i = left; i < right; i++) {
            if (nums[i] < pivot) {
                swap(nums, i, store);
                store++;
            }
        }
        swap(nums, store, right);
        return store;
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}