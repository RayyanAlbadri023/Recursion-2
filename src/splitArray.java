boolean splitArray(int[] nums) {
    return h(0, 0, 0, nums);
}

boolean h(int start, int sum1, int sum2, int[] nums) {
    if (start == nums.length) {
        return sum1 == sum2;
    }

    if (h(start + 1, sum1 + nums[start], sum2, nums)) {
        return true;
    }

    return h(start + 1, sum1, sum2 + nums[start], nums);
}
