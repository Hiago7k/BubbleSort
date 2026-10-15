public class SlindingWindowFixa02 {
    static void main() {

        int[] notas = {7, 8, 5, 10, 9};
        int k = 2;
        // achar a maior de k

        int somaJanela = 0;

        for (int i = 0; i < k; i++){
            somaJanela += notas[i];
        }

        int maiorNota = somaJanela;

        for (int i = k; i < notas.length; i++){
            somaJanela = somaJanela - notas[i - k] + notas[i];

            if (somaJanela > maiorNota){
                maiorNota = somaJanela;
            }

        }
        float maiorMedia = (float) maiorNota / k;

        System.out.printf("Maior media %.2f%n", maiorMedia);


    }
}
