package entities;

public class Radius {
    public static double circunferencia;
    public static final double PI = 3.14159; //static final = constante (nao pode mudar) // constante sempre MAISCULO
    public static double volume;

    public static void calcular(double raio){
        circunferencia = 2* PI * raio;
        volume = (4.0/3.0) * PI * Math.pow(raio, 3); //Classe uiltilitaria pode se tornar static


    }
    
    //public String toString(){
        //return 
            //String.format(" Circunferencia: %.2f\n Volume %.2f\n Valor de PI: %.2f", circunferencia, volume, pi);
    //}
}
