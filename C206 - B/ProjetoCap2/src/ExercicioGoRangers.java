import java.util.Scanner;

public class ExercicioGoRangers {
    public static void main(String[] args) {
        int viloes[] = new int[5]; // numero de viloes derrotados por ano
        int soma = 0; // soma de todos os viloes derrotados

        Scanner leitor = new Scanner(System.in); // Classe para leitura de dados

        // Leitura de dados e soma
        for (int i = 1; i <= 3; i++) {
            System.out.print("Viloes derrotados no " + i + " ano: ");
            viloes[i] = leitor.nextInt();
            soma += viloes[i];
        }

        // Saida de dados
        System.out.printf("Apreensoes: \nAno1: %d \nAno2: %d \nAno3: %d", viloes[1], viloes[2], viloes[3]);
        System.out.println("\nTotal de viloes derrotados: " + soma);
    }
}
