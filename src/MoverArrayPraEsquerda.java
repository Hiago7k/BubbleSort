void main() {
    int[] nums = {10, 20, 30, 40, 50, 60};
    //            20 30 40 50 60 10

    int firsElement = nums[0];

    for (int i = 1; i < nums.length; i++) {
        nums[i] =  nums[i + 1];
    }

    nums[0] = firsElement;

    for (int i = 0; i < nums.length; i++){
        System.out.printf("%d, ", nums[i]);
    }
}