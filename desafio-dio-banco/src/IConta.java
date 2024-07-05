public interface IConta {
    void sacar(double valorSaque);
    void depositar(double valorDeposito);
    void transferir(Conta contaDestino, double valorTranferencia);
    void imprimirExtrato();
}
