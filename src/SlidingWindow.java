public class SlidingWindow {
    static void main() {
        // Slinding window fixa

        // achar a maior soma de 3 elementos
        // nesse array
        int[] numeros = {2, 4, 1, 7, 3};
        int somaJanela = 0;

        // Fazer a Soma inicial das 3 primeiras posicoes
        for (int i = 0; i < 3; i++) {
            somaJanela += numeros[i];
        }

        int maiorSoma = somaJanela;

        for (int i = 3; i < numeros.length; i++) {
            somaJanela = somaJanela - numeros[i - 3] + numeros[i];

            if (somaJanela > maiorSoma) {
                maiorSoma = somaJanela;
            }
        }

        System.out.printf("Maior soma possivel de 3: %d%n", maiorSoma);
    }
}
