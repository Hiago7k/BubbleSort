public class ArrayDuplicado {
    static void main() {
        int[] nums = {1, 2, 3, 1};

        int c = 0;
        int naoDuplicados = 0 ;

        for (int i = 0; i < nums.length; i++){
            for (int j = i; j < nums.length -1; j++){
                if (nums[i] == nums[j+1]){
                    c++;
                }
            }
        }
        System.out.printf("Quantidade de números duplicados no array %d%n", c);
    }
}
