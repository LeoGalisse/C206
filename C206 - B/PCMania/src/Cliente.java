public class Cliente {
    String nome;
    long cpf;
    float totalCompra;
    Computador[] pc = new Computador[3];

    public float calculaTotalCompra() {
        return totalCompra;
    }

    public void compra(Computador pc, int menu) {
        this.pc[menu] = pc;
        this.pc[menu].contador++;
        totalCompra += this.pc[menu].preco;
    }

    public void carrinhoCompra() {
        System.out.println("----------Carrinho de Compras----------");
        for (int i = 0; i < pc.length; i++) {
            if (pc[i] != null) {
                System.out.println(pc[i].contador + " computador(es) da marca " + pc[i].marca);
            }
        }
        if (totalCompra == 0) {
            System.out.println("Seu carrinho esta vazio!");
        } else {
            System.out.printf("Totalizando: %.2f reais", calculaTotalCompra());
            System.out.println();
        }
    }
}
