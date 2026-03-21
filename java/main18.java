import java.util.Scanner;
public class main18 {
    public static void main(String[] args) {
        String dia, dia2, tempo, tempo2;
        int resto;
        Scanner sc = new Scanner(System.in);
        dia = sc.nextLine();
        String[] partes = dia.split(" "); //separa os : : 
        int day = Integer.parseInt(partes[1]); //converte string em algum valor; Integer == int
        tempo = sc.nextLine();
        String[] temp = tempo.split(" ");
        int hora = Integer.parseInt(temp[0]);
        int minutos = Integer.parseInt(temp[2]);
        int segundos = Integer.parseInt(temp[4]);
        dia2 = sc.nextLine();
        String[] partes2 = dia2.split(" ");
        int day2 = Integer.parseInt(partes2[1]);
        tempo2 = sc.nextLine();
        String[] temp2 = tempo2.split(" ");
        int hora2 = Integer.parseInt(temp2[0]);
        int minutos2 = Integer.parseInt(temp2[2]);
        int segundos2 = Integer.parseInt(temp2[4]);

        int total_inicio = (day *86400) + (hora*3600) + (minutos * 60) + segundos;
        int total_final = (day2 *86400) + (hora2*3600) + (minutos2 * 60) + segundos2;
        int duracao = total_final - total_inicio;
        day = duracao / 86400;
        resto = duracao%86400;
        hora = resto/3600;
        resto = resto%3600;
        minutos = resto/60;
        resto = resto%60;
        segundos = resto;
        System.out.println(day + " dia(s)");
        System.out.println(hora + " hora (s)");
        System.out.println(minutos + " minuto(s)");
        System.out.println(segundos + " segundo(s)");
        sc.close();
    }
    
}
