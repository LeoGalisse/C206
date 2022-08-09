public class ClassePrincipal {
    public static void main(String[] args) {
        Produto arroz = new Produto(105647, "28SX87Y", "Arroz", "Alimento", 12);
        Produto celular = new Produto(10697, "12TYGH5", "Samsung A50", "Celular", 1);

        arroz.mostraInfo();
        celular.mostraInfo();

        Carro ford = new Carro("branco", "Ford", "Ford Ka", 200.00, 150.00, 150, "1.0");
        Carro porshe = new Carro("preto", "Porshe", "Cayenne", 250.00, 200.00, 300, "2.0");

        ford.mostraInfo();
        ford.ligar();
        ford.acelerar();

        porshe.mostraInfo();
        porshe.ligar();
        porshe.acelerar();
    }
}
