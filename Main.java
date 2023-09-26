public class Main {
    public static void main(String[] args) {
        Conta conta1 = new Conta(TipoConta.CORRENTE, TipoCliente.PESSOA_FISICA, "01/01/2023", 1000);
        Conta conta2 = new Conta(TipoConta.POUPANCA, TipoCliente.PESSOA_JURIDICA, "01/01/2023", 500);

        conta1.sacar(800);  // Deve funcionar
        conta2.sacar(600);  // Deve gerar uma mensagem de saldo insuficiente
    }
}
