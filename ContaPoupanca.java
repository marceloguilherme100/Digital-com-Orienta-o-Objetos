public class ContaPoupanca extends Conta {
    private double taxaDeJuros;

    public ContaPoupanca(int numero, Cliente cliente, double taxaDeJuros) {
        super(numero, cliente);
        this.taxaDeJuros = taxaDeJuros;
    }

    public void calcularRendimento() {
        this.saldo += this.saldo * taxaDeJuros;
        // Registrar transação
    }

    // Getters e Setters
}
