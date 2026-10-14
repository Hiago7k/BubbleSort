public class MaiorSubArray {
    static void main() {
        int[] numeros = {0, 0, 1, 2, 1, 1, 2, 0, 0, 0, 1, 3, 0, 0, 0, 0, 3, 3, 0};
        // descobrir o tamanho do maior subarray de um determinado numero

        int quantidade = 0;
        int target = 0;

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == target) {
                quantidade++;
            } else {
                quantidade = 0;
            }
        }
        System.out.printf("O numero %d se aparece %d vezes no array%n", target, quantidade);
    }
}
