import java.util.Locale;
import java.util.Scanner;
import java.util.Locale;

 class main68 {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.print("Quantos elementos vai ter o vetor? ");
        int n = sc.nextInt();
        double[] vect = new double[n];
        double sum = 0;
        double media = 0;
        for(int i=0; i<vect.length; i++){
            System.out.print("Digite um numero: ");
            vect[i] = sc.nextDouble();
            sum += vect[i];
        }
        media = sum/n;
        System.out.printf("MEDIA DO VETOR = %.3f\n", media);
        for(int i=0; i<vect.length; i++){
            if(vect[i] < media){
                System.out.println(vect[i]);
            }
        }
        sc.close();
    }
}
