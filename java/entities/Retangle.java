package entities;

public class Retangle {
    public double altura;
    public double largura;


    public double Area(){
        return altura * largura;
    }

    public double Perimetro(){
        return 2.0 * (altura + largura);
    }

    public double Diagonal(){
        return Math.sqrt(altura * altura + largura * largura);
    }

    public String toString(){ 
        return
            "Area = "
            + String.format ("%.2f\n", Area())
            + "Perimetro = "
            + String.format("%.2f\n", Perimetro())
            + "DIAGONAL = "
            + String.format("%.2f\n", Diagonal());
        
    }
}