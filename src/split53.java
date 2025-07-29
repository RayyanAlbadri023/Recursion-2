boolean split53(int[] nums) {
    return h(0, 0, 0, nums);
}

boolean h(int start, int sum5, int sum3, int[] nums) {
    if (start == nums.length) {
        return sum5 == sum3;
    }

    int val = nums[start];
    if (val % 5 == 0) {
        return h(start + 1, sum5 + val, sum3, nums);
    }

    if (val % 3 == 0) {
        return h(start + 1, sum5, sum3 + val, nums);
    }

    if (h(start + 1, sum5 + val, sum3, nums)) {
        return true;
    }

    return h(start + 1, sum5, sum3 + val, nums);
}
