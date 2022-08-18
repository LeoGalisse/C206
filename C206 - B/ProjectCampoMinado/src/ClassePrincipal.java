import java.util.Scanner;

public class ClassePrincipal {
    public static void main(String[] args) {
        System.out.print("Digite a escala do seu Campo Minado (M x N): ");
        Scanner valorTeclado = new Scanner(System.in);
        int l = valorTeclado.nextInt();
        int c = valorTeclado.nextInt();
        int n_bombas = (l * c) / 5;
        if(n_bombas <= 1)
            n_bombas += 2;
        int contadora = 0;

        Campo minado = new Campo(l + 1, c + 1, n_bombas);

        minado.inicializarCampo();

        for (int i = 0; i < n_bombas; i++) {
            minado.bombas.criarBombas();
            minado.matrizBomba[minado.bombas.linha][minado.bombas.coluna] = -1;
        }

        minado.bombas.calculaArea();

        minado.mostrarCampo();

        while (!minado.lose) {
            System.out.println("Digite a posicao da matriz (Ou digite '0 0' para marcar uma bomba): ");
            int linha_valor = valorTeclado.nextInt();
            int coluna_valor = valorTeclado.nextInt();

            if (linha_valor == 0 && coluna_valor == 0) {
                System.out.println("Digite a posicao da matriz para marcar uma bomba: ");
                linha_valor = valorTeclado.nextInt();
                coluna_valor = valorTeclado.nextInt();
                minado.bombas.marcarBomba(linha_valor, coluna_valor, minado.matriz);
                minado.mostrarCampo();
            } else {
                if (minado.matrizBomba[linha_valor][coluna_valor] != -1) {
                    minado.matriz[linha_valor][coluna_valor] = String.valueOf(minado.matrizBomba[linha_valor][coluna_valor]);
                    minado.campoAlterado(linha_valor, coluna_valor, contadora);
                    minado.mostrarCampo();
                    contadora++;
                    minado.ganhou(contadora);
                } else
                    minado.perdeu();
            }
        }

    }
}
