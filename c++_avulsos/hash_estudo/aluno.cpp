#include "aluno.h"
#include <iostream>
    Aluno::Aluno(){
        ra = -1; // ra = -1 nulo, se chegar nesse numero sei q n tem nada
        nome = " ";
    }

    Aluno::Aluno(int r, std::string n){
        ra = r; // = para inserir em ra
        nome = n; // = para inserir o nome 
    }

    int Aluno::obterRa(){
        return ra; // retorna o valor do ra
    }

    std::string Aluno::obterNome(){
        return nome; // retorna o nome do aluno
    }
