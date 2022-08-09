public class Produto {
    int codigoSerie;
    String codigoProduto;
    String nome;
    String categoria;
    int quantidade;

    Produto(int codigoS, String codigoP, String nome, String categoria, int quantidade)
    {
        this.codigoSerie = codigoS;
        this.codigoProduto = codigoP;
        this.nome = nome;
        this.categoria = categoria;
        this.quantidade = quantidade;

        System.out.println("Produto cadastrado!");
    }

    void mostraInfo()
    {
        System.out.println("\nProduto: " + nome + "\nCodigo serie: " + codigoSerie + "\nCodigo do produto: " +
                codigoProduto + "\nCategoria: " + categoria + "\nQuantidade do produto: " + quantidade);
    }
}
