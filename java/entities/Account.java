package entities;

public class Account {
    public String nome;
    private double taxa = 5.00;
    private double saldo;

    public void Deposit(double quantia){
        if (quantia >0){
            saldo += quantia;
        }
    }

    public void Retirada(double quantia){
        if (quantia >0  && quantia + taxa <= saldo){
            saldo -=quantia;
        }
    }

    public double getSaldo(){
        return saldo;
    }
}
