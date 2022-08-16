import javax.swing.plaf.BorderUIResource;

public class ClassePrincipal {
    public static void main(String[] args) {
        Carrinho cart = new Carrinho();

        cart.produtos = new Produto[5];

        cart.produtos[0] = new Produto("Arroz", "Alimento", "Pilleco", 10.40);
        cart.produtos[1] = new Produto("Feijao", "Alimento", "Rita", 15.40);
        cart.produtos[2] = new Produto("Carne de vaca", "Carne", "Friboi", 30.56);
        cart.produtos[3] = new Produto("Frango", "Carne", "Sadia", 20.40);

        cart.exibirInfo();
        System.out.println("Total da compra: " + cart.calculaTotal());

        Empresa emp = new Empresa();

        emp.contatos = new Contato[5];

        emp.contatos[0] = new Contato("Leonardo", "leonardogalisse@gmail.com", "35991469637", "21/06/2001");
        emp.contatos[1] = new Contato("Rodrigo", "rodrigo@gmail.com", "82736273627", "21/06/2002");
        emp.contatos[2] = new Contato("Bernardo", "bernardo@gmail.com", "36775849832", "21/09/2001");

        emp.exibirInfo();

        Restaurante res = new Restaurante();

        res.fornecedores = new Fornecedor[5];

        res.fornecedores[0] = new Fornecedor("Carne", 500);
        res.fornecedores[1] = new Fornecedor("Verdura", 200);
        res.fornecedores[2] = new Fornecedor("Condimentos", 1000);
        res.fornecedores[3] = new Fornecedor("Especiarias", 60);

        res.exibirInfo();
    }
}
