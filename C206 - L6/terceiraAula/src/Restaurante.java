public class Restaurante {
    String CNPJ;
    String endereco;
    String nome;
    Fornecedor[] fornecedores;

    void exibirInfo()
    {
        for (Fornecedor fornecedor : fornecedores) {
            if (fornecedor != null)
                System.out.println("\nTipo de fornecedor: " + fornecedor.tipo + "\nQuantidade do produto: " + fornecedor.quantidade);
        }
    }
}
