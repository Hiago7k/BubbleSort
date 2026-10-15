public class SlindingWindowFixa01 {
    static void main() {
        int[] numeros = {1, 4, 2, 10, 3, 1, 0, 20};
        int k = 3;

        int somaJanela = 0;

        for (int i = 0; i < k; i++) {
            somaJanela += numeros[i];
        }

        int maiorSoma = somaJanela;

        for (int i = k; i < numeros.length; i++) {
            somaJanela = somaJanela - numeros[i - k] + numeros[i];

            if (somaJanela > maiorSoma) {
                maiorSoma = somaJanela;
            }
        }

        System.out.printf("Maior soma de k é %d%n", maiorSoma);

    }
}
