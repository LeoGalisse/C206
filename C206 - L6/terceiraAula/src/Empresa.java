public class Empresa {
    String CNPJ;
    String endereco;
    Contato[] contatos;

    void exibirInfo()
    {
        for (Contato contato : contatos) {
            if (contato != null)
                System.out.println("\nContato: " + contato.nome + "\nE-mail: " + contato.email +
                        "\nTelefone: " + contato.telefone + "\nData de nascimento: " + contato.dataNasc);
        }
    }
}
