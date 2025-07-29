boolean groupSumClump(int start, int[] nums, int target) {
    if (start >= nums.length) {
        return target == 0;
    }

    int r = start;
    int sum = 0;
    while (r < nums.length && nums[r] == nums[start]) {
        sum += nums[r];
        r++;
    }

    if (groupSumClump(r, nums, target - sum)) {
        return true;
    }

    return groupSumClump(r, nums, target);
}
