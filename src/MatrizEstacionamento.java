public class MatrizEstacionamento {
    static void main() {
        int[][] estacionamento = {
                {1, 0, 1, 0, 2, 0},
                {1, 1, 0, 0, 2, 1},
                {0, 0, 0, 1, 1, 1},
                {2, 1, 0, 0, 0, 2}
        };

        char porcentagem = '%';
        int qtdVagasOcupadas = 0;
        int qtdVagasLivres = 0;
        int qtdVagasInterditadas = 0;
        float percentualDeOcupacao = 0;
        int setorMaisCheio = 0;
        int indiceDoSetorMaisCheio = 0;

        for (int i = 0; i < estacionamento.length; i++) {

            int qtdVagasOcupadasPorlinha = 0;
            int qtdVagasLivresPorLinha = 0;
            int maiorSeqVagasLivrePorLinha = 0;
            int historicoMaiorSeq = 0;
            for (int j = 0; j < estacionamento[i].length; j++) {

                if (estacionamento[i][j] == 1) {
                    qtdVagasOcupadas++;
                    qtdVagasOcupadasPorlinha++;
                } else if (estacionamento[i][j] == 0) {
                    qtdVagasLivres++;
                    qtdVagasLivresPorLinha++;
                } else {
                    qtdVagasInterditadas++;
                }

                if (estacionamento[i][j] == 0) {
                    maiorSeqVagasLivrePorLinha++;
                } else {
                    maiorSeqVagasLivrePorLinha = 0;
                }

                if (maiorSeqVagasLivrePorLinha >= historicoMaiorSeq) {
                    historicoMaiorSeq = maiorSeqVagasLivrePorLinha;
                }

            }
            if (qtdVagasOcupadasPorlinha >= setorMaisCheio) {
                setorMaisCheio = qtdVagasOcupadasPorlinha;
                indiceDoSetorMaisCheio = (i + 1);
            }
            System.out.printf("A linha %d, possui %d vagas livres%n", (i + 1), qtdVagasLivresPorLinha);
            System.out.printf("A linha %d, possui %d vagas ocupadas%n", (i + 1), qtdVagasOcupadasPorlinha);
            System.out.printf("Maior sequência de vagas livres da linha %d é de: %d%n", (i + 1), historicoMaiorSeq);
            System.out.println();
        }

        int totalVagas = qtdVagasOcupadas + qtdVagasLivres;
        int porcetagem = totalVagas - qtdVagasOcupadas;
        percentualDeOcupacao = (float) totalVagas * porcetagem / 100;
        float reultadoOcupacao = percentualDeOcupacao * totalVagas;

        System.out.println();
        System.out.println("==== Relatório ====");
        System.out.printf("Quantidade vagas ocupadas: %d%n", qtdVagasOcupadas);
        System.out.printf("Quantidade vagas livres: %d%n", qtdVagasLivres);
        System.out.printf("Quantidade vagas interditadas: %d%n", qtdVagasInterditadas);
        System.out.printf("Percentual de ocupação: %.2f%s%n", reultadoOcupacao, porcentagem);
        System.out.printf("Setor com mais ocupação: %d%n", indiceDoSetorMaisCheio);
    }
}
