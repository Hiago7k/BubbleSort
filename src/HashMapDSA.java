import java.util.HashMap;

public class HashMapDSA {
    static void main() {
        int[] nums = {1, 2, 3, 2};
        HashMap<Integer, Integer> seens = new HashMap<>();
        int c = 0;

        for (int i = 0; i < nums.length; i++){
            if (seens.containsKey(nums[i])){
                seens.get(nums[1]);
                c++;
            }else {
                seens.put(nums[i], 1);
            }
        }

        if(c > 0){
            System.out.println("Tem duplicados");
        }else {
            System.out.println("Não tem duplicados");
        }
    }
}
