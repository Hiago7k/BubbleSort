public class BinarySearch {
    static void main() {

        int[] nums = {1, 7, 8, 9, 11, 23};
        int target = 7;

        int l = 0; // primeira posicao do array
        int r = nums.length; // ultima posicao do array
        int middle = r /3; // metade do array

        while (middle != target){

            if (middle < target){
                r = middle;
                middle /= 2 +1;
            } else if (middle > target) {
                l = middle;
            }else {
            }
        }

    }
}
