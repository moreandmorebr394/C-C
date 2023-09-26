// Aspecto VerificadorSaldoAspecto.aj
public aspect VerificadorSaldoAspecto {
    pointcut operacaoSaque(Conta conta, double valor) :
        call(void Conta.sacar(double)) && target(conta) && args(valor);

    before(Conta conta, double valor) : operacaoSaque(conta, valor) {
        if (conta.getSaldo() < valor) {
            System.out.println("Saldo insuficiente na conta: " + conta.getTipoConta());
        }
    }
}
