package entities;

public class Fix3 {
    String nome;
    double nota;
    double nota2;

    public Fix3(String nome, double nota, double nota2){
        this.nome = nome;
        this.nota = nota;
        this.nota2 = nota2;
    }

    public double getNota(){
        return nota;
    }

    public double getNota2(){
        return nota2;
    }

    public String getNome(){
        return nome;
    }
}
