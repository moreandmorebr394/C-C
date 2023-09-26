import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class ContaPoupanca extends Conta {
    public ContaPoupanca(TipoConta tipoConta, TipoCliente tipoCliente, String dataAbertura, double saldo) {
        super(tipoConta, tipoCliente, dataAbertura, saldo);
    }
    
    public void calculaValorTarifaManutencao() {
        // Lógica para tarifa de manutenção de investimento
        if (contaInativaAteSeisMeses()) {
            double tarifa = getSaldo() * 0.02; // 2% de tarifa
            System.out.println("Tarifa de manutenção aplicada: " + tarifa);
            sacar(tarifa);
        }
    }

    private boolean contaInativaAteSeisMeses() {
        // Obtém a data atual (estou considerando que você tem uma classe que fornece a data atual)
        String dataAtual = DataUtils.getDataAtual(); // Substitua DataUtils.getDataAtual() pelo método que você utiliza para obter a data atual

        // Calcula a diferença entre a última atividade e a data atual em meses
        int mesesInativos = DataUtils.calcularMesesEntreDatas(ultimaAtividade, dataAtual); // Substitua DataUtils.calcularMesesEntreDatas() pelo método que calcula a diferença em meses entre duas datas

        // Retorna true se a conta estiver inativa por até seis meses
        return mesesInativos <= 6;
    }
}
