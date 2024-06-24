public abstract class Conta {
    protected int numero;
    protected double saldo;
    protected Cliente cliente;

    public Conta(int numero, Cliente cliente) {
        this.numero = numero;
        this.cliente = cliente;
        this.saldo = 0.0;
    }

    public void depositar(double valor) {
        this.saldo += valor;
        // Registrar transação
    }

    public void sacar(double valor) {
        if (saldo >= valor) {
            this.saldo -= valor;
            // Registrar transação
        } else {
            // Exibir mensagem de saldo insuficiente
        }
    }

    public void transferir(double valor, Conta destino) {
        if (saldo >= valor) {
            this.sacar(valor);
            destino.depositar(valor);
            // Registrar transação
        } else {
            // Exibir mensagem de saldo insuficiente
        }
    }

    public double consultarSaldo() {
        return this.saldo;
    }

    // Getters e Setters
}
