import java.util.Locale;
import java.util.Scanner;

import entities.Salary;
public class main53 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Salary salario = new Salary();
        System.out.print("Name: ");
        salario.name = sc.nextLine();

        System.out.print("Salario: ");
        salario.salario = sc.nextDouble();

        System.out.print("Taxa: ");
        salario.taxa = sc.nextDouble();

        System.out.println("Empregado: " + salario.toString());

        System.out.print("Qual a porcentagem de taxa sera Aplicada no salario? ");
        double porcentagem = sc.nextDouble();
        salario.aumentoSalario(porcentagem);

        System.out.print("Funcionario Alterado:" + salario.toString());

        sc.close();
    }
}
