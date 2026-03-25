import java.util.Scanner;
public class bee1046 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inicio,fim;
        int duracao = 0;
        inicio = sc.nextInt();
        fim = sc.nextInt();
        if (fim > inicio){
            duracao = fim - inicio;
        }else if(fim < inicio){
            duracao = (24 - inicio) + fim;
        }else if(inicio == fim){
            duracao = 24;
        }
        System.out.printf("O JOGO DUROU %d HORA(S)\n",duracao);
    }
}
