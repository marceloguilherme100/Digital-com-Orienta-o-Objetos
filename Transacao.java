import java.util.Date;

public class Transacao {
    private String tipo;
    private double valor;
    private Date data;
    private Conta contaOrigem;
    private Conta contaDestino;

    public Transacao(String tipo, double valor, Conta contaOrigem, Conta contaDestino) {
        this.tipo = tipo;
        this.valor = valor;
        this.data = new Date();
        this.contaOrigem = contaOrigem;
        this.contaDestino = contaDestino;
    }

    public void registrarTransacao() {
        // Lógica para registrar a transação
    }

    // Getters e Setters
}
