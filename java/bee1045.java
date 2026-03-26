import java.util.Locale;
import java.util.Scanner;
public class bee1045 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner (System.in);
        double a,b,c;
        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();

        double temp;
        if (a < b){temp = a; a=b; b=temp;}
        if (a < c){temp = a; a=c; c=temp;}
        if (b < c){temp = b; b=c; c=temp;}


        if(a >= b+c){
            System.out.println("NAO FORMA TRIANGULO");
        }else {
            if (a*a == b*b + c*c){
            System.out.println("TRIANGULO RETANGULO");
        }else if(a*a > b*b + c*c){
            System.out.println("TRIANGULO OBTUSANGULO");
        }else{
            System.out.println("TRIANGULO ACUTANGULO");
        }if (a == b && b == c){
            System.out.println("TRIANGULO EQUILATERO");
        }else if (a == b|| a == c || b ==c){
            System.out.println("TRIANGULO ISOSCELES");
        }
            sc.close();
        }
    }
}


