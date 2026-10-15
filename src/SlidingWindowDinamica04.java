public class SlidingWindowDinamica04 {
    static void main() {
        int[] gastos = {2, 1, 3, 2, 1};


        int orcamento = 5;
        int esquerda = 0;
        int soma = 0;
        int menorTamanho = gastos.length + 1;

        for (int direita = 0; direita < gastos.length; direita++) {

            soma += gastos[direita];

            while (soma >= orcamento) {

                int tamanho = direita - esquerda + 1;

                if (tamanho < menorTamanho) {
                    menorTamanho = tamanho;
                }

                soma -= gastos[esquerda];
                esquerda++;
            }
        }


        if (menorTamanho == gastos.length + 1) {
            System.out.println(0);
        } else {
            System.out.println(menorTamanho);
        }

    }
}
