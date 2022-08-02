import java.util.Scanner;

public class primeiraAula {
    public static void main(String[] args) {
        int idade;
        String nome, cpf;
        String eleitor;
        boolean titulo = false;

        Scanner leitor = new Scanner(System.in);

        System.out.print("Entre com a sua idade: ");
        idade = leitor.nextInt();

        leitor.nextLine();

        System.out.print("Digite seu nome: ");
        nome = leitor.nextLine();

        System.out.print("Digite seu CPF: ");
        cpf = leitor.nextLine();

        System.out.print("Voce tem titulo de eleitor? S/N: ");
        eleitor = leitor.nextLine();

        if(eleitor.equals("S"))
            titulo = true;

        System.out.printf("Seu nome eh: %s \nSua idade eh: %d \nSeu cpf eh: %s", nome, idade, cpf);
        if(titulo)
            System.out.println("\nVoce possui titulo de eleitor");
        else System.out.println("\nVoce nao possui titulo de eleitor");
    }
}
