public class BancoDigital {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("João Silva", "123.456.789-00", "Rua A, 123");
        ContaCorrente contaCorrente1 = new ContaCorrente(1001, cliente1, 500.0);
        ContaPoupanca contaPoupanca1 = new ContaPoupanca(1002, cliente1, 0.01);

        contaCorrente1.depositar(1000.0);
        contaPoupanca1.depositar(2000.0);

        contaCorrente1.transferir(300.0, contaPoupanca1);

        contaPoupanca1.calcularRendimento();

        System.out.println("Saldo Conta Corrente: " + contaCorrente1.consultarSaldo());
        System.out.println("Saldo Conta Poupança: " + contaPoupanca1.consultarSaldo());
    }
}
