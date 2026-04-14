package entities;

public class Banc {
    private final int conta;
    private String nomeTitular;
    private double saldo;

    public Banc(int conta, String nomeTitular){
        this.conta = conta;
        this.nomeTitular = nomeTitular;
    }

    public Banc(int conta, String nomeTitular, double depositoInicial){
        this.conta = conta;
        this.nomeTitular = nomeTitular;
        depositar(depositoInicial);
    }

    public int getConta(){
        return conta;
    }

    public double getSaldo(){
        return saldo;
    }

    public String getNomeTitular(){
        return nomeTitular;
    }

    public void setNomeTitular(String nomeTitular){
        this.nomeTitular = nomeTitular;
    }

    public void depositar(double valor){
        saldo += valor;
    }

    public void sacar(double valor) {
        saldo -= valor + (valor * 0.05);
    }

    public String toString(){
        return "Conta : "
                + getConta()
                + ", Titular: "
                + getNomeTitular()
                + ", Saldo: "
                + String.format("%/2f", getSaldo());
    }


}
