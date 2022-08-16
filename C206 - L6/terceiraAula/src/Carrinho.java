public class Carrinho {
    double total;
    Produto[] produtos;

    void exibirInfo()
    {
        for (Produto produto : produtos) {
            if (produto != null)
                System.out.println("\nProduto: " + produto.nome + "\nDescricao: " + produto.descricao +
                        "\nFabricante: " + produto.fabricante + "\nPreco: " + produto.preco);
        }
    }

    double calculaTotal()
    {
        for (Produto produto : produtos) {
            if (produto != null)
                total += produto.preco;
        }

        return total;
    }
}
