import java.util.Random;

public abstract class Conta implements IConta {
    private static int SEQUENCIAL = 1;
    private static final int AGENCIA_PADRAO = 1;

    protected int agencia;
    protected int numero;
    protected double saldo;
    protected Cliente cliente;

    public Conta(Cliente cliente) {
        this.agencia = AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.cliente = cliente;
    }

    public Conta(Cliente cliente, double saldo) {
        this.agencia = AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.cliente = cliente;
        this.depositar(saldo);
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }


    @Override
    public void sacar(double valorSaque) {
        if (valorSaque <= getSaldo()) {
            this.saldo -= valorSaque;
        } else {
            System.out.println("Valor do saque excede valor do saldo, verifique.");
        }
    }

    @Override
    public void depositar(double valorDeposito) {
        this.saldo += valorDeposito;

    }

    @Override
    public void transferir(Conta contaDestino, double valorTranferencia) {
        if (valorTranferencia <= getSaldo()) {
            this.sacar(valorTranferencia);
            contaDestino.depositar(valorTranferencia);
        } else {
            System.out.println("Valor da transferencia excede valor do saldo, verifique.");
        }
    }

    protected void imprimirInfosComuns() {
        System.out.println(String.format("Titular: %s", this.cliente.getNome()));
        System.out.println(String.format("Agencia: %d", this.getAgencia()));
        System.out.println(String.format("Numero: %d", this.getNumero()));
        System.out.println(String.format("Saldo: %.2f", this.getSaldo()));
    }
}
