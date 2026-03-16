#include <iostream>
#include "13.h"

Pessoa::Pessoa(int _idade, std::string _nome){
    idade = _idade;
    nome = _nome;
    
}
 
Pessoa::~Pessoa(){ 
    std::cout << " Deleted ";
}

void Pessoa::mostra(){
    std::cout << "Seu Nome e: " << nome << "\n";
    std::cout << "Sua idade e: " << idade; 
}

Cliente::Cliente (int _idade, std::string _nome, float _salario) : Pessoa(_idade, _nome){
    salario = _salario;
}

void Cliente::mostra(){
    Pessoa::mostra();
    std::cout << " Salario: " << salario;
}