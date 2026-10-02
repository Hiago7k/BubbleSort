public class MoverArrayPraEsquerda {
    static void main() {

        int[] nums = {10, 20, 30, 40, 50, 60};
        //60 10 20 30 40 50

        int backup = 0;
        for (int i = 0; i < nums.length; i++) {

            if (i < nums.length -1) {
                int varAux = nums[i + 1];
                nums[i] = varAux;
            }

            if (i == 5){
                nums[0] = nums[i];
            }
        }


        System.out.println("Novo array");
        for (int i = 0; i < nums.length; i++) {
            System.out.printf("%d, ", nums[i]);
        }
    }
}
