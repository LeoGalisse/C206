public class Computador {
    String marca;
    float preco;
    SistemaOperacional os;
    HardwareBasico[] hb = new HardwareBasico[3];
    MemoriaUSB musb;
    int contador = 0;

    public Computador(String marca, float preco, String nome, int tipo, String nome1, int capacidade1,
                      String nome2, int capacidade2, String nome3, int capacidade3)
    {
        this.marca = marca;
        this.preco = preco;
        os = new SistemaOperacional(nome, tipo);
        hb[0] = new HardwareBasico(nome1, capacidade1);
        hb[1] = new HardwareBasico(nome2, capacidade2);
        hb[2] = new HardwareBasico(nome3, capacidade3);
    }

    void mostraPCConfigs()
    {
        System.out.println();
        System.out.printf("Essa promocao contem um computador da marca: %s \nCom um incrivel preco " +
                "promocional de %.2f reais!", marca, preco);
        System.out.println();
        for (int i = 0; i < hb.length; i++) {
            if(i == 0) System.out.println("Com um processador " + hb[i].nome + "(" + hb[i].capacidade + ") MHz");
            else if(i == 1) System.out.println(hb[i].capacidade + "Gb de " + hb[i].nome);
            else System.out.println(hb[i].nome + "(" + hb[i].capacidade + " Gb)");
        }
        System.out.println("Com um sistema operacional " + os.nome + " (" + os.tipo + " bits)");
        if(musb != null)
            System.out.println("Acompanha " + musb.nome + " de " + musb.capacidade + "Gb");

    }

    void addMemoriaUSB(MemoriaUSB musb)
    {
        this.musb = musb;
    }
}
