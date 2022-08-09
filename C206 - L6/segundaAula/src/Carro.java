public class Carro {
    String cor;
    String marca;
    String modelo;
    double velocidadeMax;
    double velocidadeAtual;
    Motor motor;

    Carro(String cor, String marca, String modelo, double vMax, double vAtual, int potencia, String tipo)
    {
        this.cor = cor;
        this.marca = marca;
        this.modelo = modelo;
        this.velocidadeMax = vMax;
        this.velocidadeAtual = vAtual;
        motor = new Motor(potencia, tipo);
    }

    void ligar()
    {
        System.out.println("O carro esta ligado!");
    }

    void acelerar()
    {
        System.out.println("O carro esta aumentando a velocidade");
    }

    void mostraInfo()
    {
        System.out.println("\nO carro da marca " + marca + " tem a cor " + cor + "\nModelo: " + modelo +
                "\nPode chegar ate " + velocidadeMax + "km/h" + "\nSua velocidade atual eh de: " + velocidadeAtual);
        System.out.println("O motor do carro tem a potencia de: " + motor.potencia + "\nDe tipo: " + motor.tipo);
    }
}
