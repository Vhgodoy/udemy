package ExercicioFixacao.Util;

public class CurrencyConverter {

    public static double dolar;

    public static double converter (double total) {
        double mont = dolar * total;
        double iof = mont / 100 * 6;
        return mont + iof;
    }
}
