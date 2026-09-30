public class BubbleSort {
    static void main() {

        int[] nums = {2, 23, 1, 9, 0, 2, 21};

        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = 0; j < nums.length - 1 - i; j++) {
                if (nums[j] > nums[i + 1]) {
                    int valor = nums[j];
                    nums[j + i] = valor;
                }
            }
        }

        System.out.println("Mostrando o array ordenado");
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }

    }
}
