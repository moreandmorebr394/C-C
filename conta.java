// Classe Conta.java
public class Conta {
    private TipoConta tipoConta;
    private TipoCliente tipoCliente;
    private String dataAbertura;
    private double saldo;

    public Conta(TipoConta tipoConta, TipoCliente tipoCliente, String dataAbertura, double saldo) {
        this.tipoConta = tipoConta;
        this.tipoCliente = tipoCliente;
        this.dataAbertura = dataAbertura;
        this.saldo = saldo;
    }

    public void depositar(double valor) {
        saldo += valor;
        System.out.println("Depositado: " + valor);
    }

    public void sacar(double valor) {
        saldo -= valor;
        System.out.println("Sacado: " + valor);
    }

    public double getSaldo() {
        return saldo;
    }

    public TipoConta getTipoConta() {
        return tipoConta;
    }
}

// Enumerador TipoConta.java
public enum TipoConta {
    POUPANCA, INVESTIMENTO, SALARIO, CORRENTE
}

// Enumerador TipoCliente.java
public enum TipoCliente {
    PESSOA_FISICA, PESSOA_JURIDICA
}
