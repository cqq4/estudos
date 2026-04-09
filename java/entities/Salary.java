package entities;

public class Salary {
    public String name;
    public double salario;
    public double taxa;

    public double salarioLiquido(){
        return salario - taxa;
    }

    public void aumentoSalario(double porcentagem){
        salario += salario * porcentagem/ 100.0;
    }

    public String toString(){
        return
            "Funcionario: "
            + name 
            +", "
            + "$ "
            + String.format("%.2f", salarioLiquido());
    }
}
