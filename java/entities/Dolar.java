package entities;

public class Dolar {
    public static double VALOR;
    public static double COTACAO;

    public static double CurrencyConverter(double total){
        return total * COTACAO * 1.06;
    }
}
