public class SlindingWindowFixa03 {
    static void main() {

        int[] numeros = {2, 3, 1, 2, 4, 3};
        int alvo = 7;

        int esquerda = 0;
        int soma = 0;
        int menorTamanho = numeros.length + 1;

        for (int direita = 0; direita < numeros.length; direita++) {

            soma += numeros[direita];

            while (soma >= alvo) {

                int tamanho = direita - esquerda + 1;

                if (tamanho < menorTamanho) {
                    menorTamanho = tamanho;
                }

                soma -= numeros[esquerda];
                esquerda++;
            }
        }

        if (menorTamanho == numeros.length + 1) {
            System.out.println(0);
        } else {
            System.out.println(menorTamanho);
        }

    }
}
