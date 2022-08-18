import java.util.LinkedList;
import java.util.Queue;

public class Campo {
    int cont = 0;
    String[][] matriz;
    int[][] matrizBomba;
    boolean lose = false;
    Bomba bombas;
    int[] vet_linha = new int[]{-1, 1, 0, 0, 1, 1, -1, -1};
    int[] vet_coluna = new int[]{0, 0, -1, 1, 1, -1, 1, -1};
    int n_bombas;
    int[] vazio_iv = new int[9];
    int[] vazio_jv = new int[9];
    boolean[][] vis = new boolean[100][100];

    Campo(int l, int c, int n) {
        this.matriz = new String[l][c];
        this.matrizBomba = new int[l][c];
        this.n_bombas = n;
        bombas = new Bomba(matrizBomba, l, c);
    }

    void inicializarCampo() {
        for (int i = 1; i < matriz.length; i++) {
            for (int j = 1; j < matriz[0].length; j++) {
                matriz[i][j] = "X";
                matrizBomba[i][j] = 0;
            }
        }
    }

    void mostrarCampo() {
        cont = 0;
        matriz[0][0] = "0";
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                if (i == 0 && j != 0)
                    matriz[i][j] = String.valueOf(++cont);
                else if (j == 0 && i != 0) {
                    if (j == 0 && i == 1)
                        cont = 0;
                    matriz[i][j] = String.valueOf(++cont);
                }
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public void campoAlterado(int i, int j, int contadora) {
        Queue<Integer> q = new LinkedList<>();
        vis[i][j] = true;
        do {
            if(!q.isEmpty()) {
                i = q.peek();
                q.remove();
                j = q.peek();
                q.remove();
            }

            if (i != 0 && j != 0 && (matrizBomba[i][j] == 0 || contadora == 0)) {
                for (int k = 0; k < 8; k++) {
                    int iv = i + vet_linha[k];
                    int jv = j + vet_coluna[k];

                    if (bombas.isValid(iv, jv)) {
                        if (matrizBomba[i][j] != -1)
                            if (matrizBomba[iv][jv] != -1 && matrizBomba[i][j] == 0)
                                matriz[iv][jv] = String.valueOf(matrizBomba[iv][jv]);
                        if (matrizBomba[iv][jv] == 0) {
                            if(!vis[iv][jv]) {
                                q.add(iv);
                                q.add(jv);
                                vis[iv][jv] = true;
                            }
                        }
                    }
                }
            }
        } while (!q.isEmpty());
    }

    void perdeu() {
        lose = true;
        for (int i = 1; i < matriz.length; i++) {
            for (int j = 1; j < matriz[0].length; j++) {
                System.out.print(matrizBomba[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("Voce estorou a bomba!");
    }

    void ganhou(int tentativa) {
        cont = 0;
        for (int i = 1; i < matriz.length; i++) {
            for (int j = 1; j < matriz[0].length; j++) {
                if (matriz[i][j].equals("X") || matriz[i][j].equals("B"))
                    cont++;
            }
        }

        if (cont <= n_bombas) {
            lose = true;
            System.out.println("\nVoce ganhou!!" + "\nEm " + tentativa + " tentativas!");
        }
    }
}
