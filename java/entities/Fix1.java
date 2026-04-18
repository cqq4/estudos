package entities;

public class Fix1 {
    String nome;
    int idade;
    double altura;

    public Fix1(String nome, int idade, double altura){
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(){
        this.nome = nome;
    }

    public int getIdade(){
        return idade;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }

    public double getAltura(){
        return altura;
    }

    public void setAltura(double altura){
        this.altura = altura;
    }
}
