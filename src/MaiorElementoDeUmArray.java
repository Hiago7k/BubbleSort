public class MaiorElementoDeUmArray {
    static void main() {

        int[] nums = {2, 23, 122, 9, 0, 2, 21};

        int maiorValor = 0;
        for(int i = 0; i < nums.length; i++){
            if (nums[i] > maiorValor){
                maiorValor = nums[i];
            }
        }

        System.out.println(maiorValor);
    }
}
