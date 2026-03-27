import java.util.Scanner;
public class bee1047 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b,c,d,duracao, inicio, fim, horas, minutos;
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        d = sc.nextInt();
        inicio = a*60 + b;
        fim = c*60 + d;ti
        if (fim <= inicio){
            fim +=24*60;
        }
        duracao = fim - inicio;
        horas = duracao/60;
        minutos = duracao%60;
        System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)\n", horas, minutos);
    }
    
}
