public class Cliente {
    private String nome;
    private String cpf;
    private String endereco;

    public Cliente(String nome, String cpf, String endereco) {
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
    }

    // Getters e Setters

    public void abrirConta(Conta conta) {
        // Lógica para abrir conta
    }

    public void fecharConta(Conta conta) {
        // Lógica para fechar conta
    }
}
