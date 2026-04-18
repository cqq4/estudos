package entities;

public class Rent {
    private String nome;
    private String email;
    private int quarto;

    public Rent(String nome, String email){
        this.nome = nome;
        this.email = email;
    }

    public String getNome(){
        return nome;
    }

    public String getEmail(){
        return email;
    }

    public String toString() {
        return nome + ", " + email;
    }
}
