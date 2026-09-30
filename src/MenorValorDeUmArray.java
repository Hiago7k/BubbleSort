public class MenorValorDeUmArray {
    static void main() {
        int[] nums = {2, 23, 122, -9, 0, 2, 21};


        int menorValor = nums[0];

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < menorValor) {
                menorValor = nums[i];
            }
        }

        System.out.println(menorValor);
    }
}
