import java.util.Random;

public class Bomba {
    int limite1, limite2;
    int linha, coluna;
    int[][] matriz;
    int[] vet_linha = new int[]{-1, 1, 0, 0, 1, 1, -1, -1};
    int[] vet_coluna = new int[]{0, 0, -1, 1, 1, -1, 1, -1};

    Bomba(int[][] matriz, int limite1, int limite2)
    {
        this.matriz = matriz;
        this.limite1 = limite1;
        this.limite2 = limite2;
    }

    void marcarBomba(int linha, int coluna, String[][] matriz)
    {
        matriz[linha][coluna] = "B";
    }

    void criarBombas()
    {
        Random randomGenerator = new Random();
        linha = randomGenerator.nextInt(1,limite1);
        coluna = randomGenerator.nextInt(1,limite2);
    }

    boolean isValid(int i, int j)
    {
        if(i < 1 || i >= matriz.length || j < 1 || j >= matriz[0].length)
            return false;
        return true;
    }

    void calculaArea()
    {
        for (int i = 1; i < matriz.length; i++) {
            for (int j = 1; j < matriz[0].length; j++) {
                for (int k = 0; k < 8; k++) {
                    int iv = i + vet_linha[k];
                    int jv = j + vet_coluna[k];

                    if(isValid(iv, jv))
                    {
                        if(matriz[i][j] == -1 && matriz[iv][jv] != -1)
                            matriz[iv][jv] += 1;
                    }
                }
            }
        }
    }

}
