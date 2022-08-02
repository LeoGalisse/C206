import java.util.Scanner;

public class ClassePrincipal {
    public static void main(String[] args) {

        // Comentario de uma linha

        /*
        Comentario de
        multiplas linhas
        */

        /**
         * JavaDoc
         */

        // Criando um tipo primitivo
        int idade = 21;

        // Criando uma classe
        String nome = "Leonardo";

        // Saida de dados
        System.out.println("Meu nome eh: " + nome + ", e minha idade: " + idade);

        System.out.println(nome.toUpperCase());
        System.out.println(nome.toLowerCase());
        System.out.println(nome.length());

        // Casting
        double d = 3.1415;
        int i = (int)d;
        System.out.println(i);
        int t = 1000;
        byte teste = (byte)t;
        System.out.println(teste);

        // Leitura de dados
        Scanner leitor = new Scanner(System.in);

        nome = leitor.nextLine();
        System.out.println("Nome: " + nome);

        idade = leitor.nextInt();
        System.out.println("Idade: " + idade);
    }
}
