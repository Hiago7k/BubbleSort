public class MatrizEstacionamento {
    static void main() {
        int[][] estacionamento = {
                {1, 0, 1, 0, 2, 0},
                {1, 1, 0, 0, 2, 1},
                {0, 0, 0, 1, 1, 1},
                {2, 1, 0, 0, 0, 2}
        };
        // 0 - Vaga livre
        // 1 - Vaga ocupada
        // 2 - Vaga interditada, por manutenção
        // cada linha representa um setor, do estacionamento
        // cada coluna representa  posição da vaga dentro do setor

        int qtdVagasOcupadas = 0;
        int qtdVagasLivres = 0;

        for (int i = 0; i < estacionamento.length; i++){
            for (int j = 0; j < estacionamento[i].length; j++){
                System.out.printf("%d ", estacionamento[i][j]);
                if (estacionamento[i][j] == 1) {
                    qtdVagasOcupadas += estacionamento[i][j];
                }
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("==== Relatorio ====");
        System.out.printf("Quantidade vagas ocupadas: %d", qtdVagasOcupadas);
    }
}
