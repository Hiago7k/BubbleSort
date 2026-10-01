public class JogarElementoDoArrayPrAdireita {
    static void main() {
        // dado um array, atualize ele para direita
        // 10 20 30 40 50 60
        // saida esperada 60 10 20 30 40 50

        int[] nums = {60, 10, 20, 30, 40, 50};
        int history = nums[0];
        // mover pra direita
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > nums.length) {
                nums[0] = history;
            } else {
                nums[i] = nums[i + 1];
            }
        }

        System.out.println("****************************");
        System.out.println("Array atalizado");
        for (int i = 0; i < nums.length; i++) {
            System.out.printf("%d, ", nums[i]);
        }
    }
}
