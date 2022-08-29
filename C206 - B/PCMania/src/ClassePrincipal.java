import java.util.Scanner;

public class ClassePrincipal {
    public static void main(String[] args) {
        System.out.println("----------Bem-vindo a PC Mania!----------");
        int menu = -1;
        Cliente cliente = null;
        Computador[] pc = new Computador[3];
        MemoriaUSB musb0 = new MemoriaUSB("Pen-drive", 16);
        MemoriaUSB musb1 = new MemoriaUSB("Pen-drive", 32);
        MemoriaUSB musb2 = new MemoriaUSB("HD", 1000);

        pc[0] = new Computador("Positivo", 1300.00f, "Linux Ubuntu", 32,
                "Pentium Core i3", 1200, "Memoria RAM", 4, "HD", 500);
        pc[0].addMemoriaUSB(musb0);
        pc[1] = new Computador("Acer", 1800.00f, "Windows 8", 64,
                "Pentium Core i5", 2260, "Memoria RAM", 8, "HD", 1000);
        pc[1].addMemoriaUSB(musb1);
        pc[2] = new Computador("Vaio", 2800.00f, "Windows 10", 64,
                "Pentium Core i7", 3500, "Memoria RAM", 16, "HD", 2000);
        pc[2].addMemoriaUSB(musb2);

        while (menu != 0) {
            if(cliente == null)
            {
                cliente = new Cliente();
                System.out.println("Parece que esse eh seu primeiro acesso na loja");
                System.out.print("Faca seu cadastro!\nDigite seu nome: ");
                Scanner nome = new Scanner(System.in);
                String n = nome.nextLine();
                cliente.nome = n;
                System.out.print("E para finalizar, seu CPF (apenas numeros): ");
                Scanner cpf = new Scanner(System.in);
                long c = cpf.nextLong();
                cliente.cpf = c;
            }

            System.out.println("\nOla " + cliente.nome + " para prosseguir, digite um número respectivo ao item que deseja acessar: ");
            System.out.println("0 - Sair sem comprar (ta pobre)\n1 - Ver promocoes\n2 - Verificar carrinho de compra\n3 - Fechar a compra");
            Scanner teclado = new Scanner(System.in);
            menu = teclado.nextInt();

            switch (menu) {
                case 0:
                    if(cliente.calculaTotalCompra() != 0) {
                        cliente.carrinhoCompra();
                        System.out.println("\nVoce ainda tem itens no carrinho, tem certeza que deseja sair?(S/N)");
                        Scanner sair = new Scanner(System.in);
                        String s = sair.nextLine();
                        if(s.equalsIgnoreCase("S")) menu = 0;
                        else menu = -1;
                    }
                    break;
                case 1:
                    while (menu != 4) {
                        System.out.println("Selecione um dos itens para mais detalhes:");
                        System.out.println("1 - Positivo (1.300,00)\n2 - Acer (1.800,00)\n3 - Vaio (2.800,00)\n4 - Voltar");
                        menu = teclado.nextInt();
                        if(menu != 4) {
                            pc[menu - 1].mostraPCConfigs();
                            System.out.println("\nVoce deseja comprar esse item da promocao? (S/N)");
                            Scanner tec = new Scanner(System.in);
                            String aux = tec.nextLine();

                            if(aux.equalsIgnoreCase("S"))
                            {
                                cliente.compra(pc[menu - 1], menu - 1);
                                System.out.println("Item adicionado ao carrinho!");
                            }
                        }
                    }
                    break;
                case 2:
                    cliente.carrinhoCompra();
                    break;
                case 3:
                    System.out.println(cliente.nome + "  " + cliente.cpf);
                    System.out.println();
                    if(cliente.calculaTotalCompra() != 0) {
                        cliente.carrinhoCompra();
                        System.out.println("Obrigado pela preferencia e volte sempre!");
                        menu = 0;
                    }
                    else System.out.println("Voce nao possue nenhum item no carrinho!");
                    break;
            }
        }
    }
}
