import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DataUtils {
    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

    public static String getDataAtual() {
        Calendar cal = Calendar.getInstance();
        return dateFormat.format(cal.getTime());
    }

    public static int calcularMesesEntreDatas(String dataInicio, String dataFim) {
        try {
            Date dataInicial = dateFormat.parse(dataInicio);
            Date dataFinal = dateFormat.parse(dataFim);

            Calendar calInicial = Calendar.getInstance();
            calInicial.setTime(dataInicial);

            Calendar calFinal = Calendar.getInstance();
            calFinal.setTime(dataFinal);

            int anos = calFinal.get(Calendar.YEAR) - calInicial.get(Calendar.YEAR);
            int meses = calFinal.get(Calendar.MONTH) - calInicial.get(Calendar.MONTH);
            int totalMeses = anos * 12 + meses;

            return totalMeses;
        } catch (ParseException e) {
            e.printStackTrace();
            return -1; // Retorna um valor negativo em caso de erro
        }
    }
}
