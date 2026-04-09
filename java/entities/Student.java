package entities;

public class Student {
    public String Name;
    public double n1, n2, n3;

    public String Name(){
        return Name;
    }

    public double Media(){
        return n1+ n2 + n3;
    }

    public boolean Pass(){
        return Media() >=60; // maior ou = a 60 aprovado
    } 

    public double notPass(){
        if(Pass()){
            return 0.0; //se passou n retira nada
        }
        return 60.00 - Media(); //se nao passou mostra qts pontos precisam 
    }

    public String toString(){
        return
            "MEDIA FINAL = "
            + String.format("%.2f", Media());
    }
}
