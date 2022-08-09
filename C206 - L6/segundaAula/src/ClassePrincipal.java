public class ClassePrincipal {
    public static void main(String[] args) {
        int codigoSerie;
        String codigoProduto;
        String nome;
        String categoria;
        int quantidade;

        Produto arroz = new Produto(105647, "28SX87Y", "Arroz", "Alimento", 12);
        Produto celular = new Produto(10697, "12TYGH5", "Samsung A50", "Celular", 1);

        arroz.mostraInfo();
        celular.mostraInfo();
    }
}
