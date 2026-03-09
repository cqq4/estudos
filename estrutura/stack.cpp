//Define oq cada atributo da class faz pilha(); //funcao construct precisa do msm nome da class
#include <iostream>
#include "stack.h"  
    stack::stack(){
        int tamanho = 0; //sem elementos
        estrutura = new TipoItem[max_itens]; //cria o vetor com tamanho max (100)
    }

    stack::~stack(){
        delete[] estrutura; //deleta vetor
    }

    bool stack::cheio(){
        return(tamanho == max_itens); //se o tamanho for = max de item
        if (tamanho == 0){
            return false;
        }
    }

    void stack::inserir(TipoItem item){
        if(cheio() == false){ //se a cheio = false, insere o numero na tabela 
            estrutura[tamanho] = item; 
            tamanho++;
        }else{ // se cheio = true, nao e possivel inserir
            std::cout << "A pilha esta cheia, Nao e possivel inserir!\n";

        }
    }

    TipoItem stack::remove(){
        if(cheio() == false){ // = se cheio = false, nao e possivel remover nada
            std::cout << "A pilha esta vazia, nao posso remover";
            return 0;
        }else { // = se cheio = true, remove o ultimo numero adicionado na tabela
            tamanho --;
            return estrutura[tamanho-1]; 
        }
    }

    void stack::print(){
        for(int i =0; i < tamanho; i++){  //i = 0, enqt i for menor doq o tamanho da tabela, percorre por ela completa
            //estrutura = i
            std:: cout << estrutura[i] << std::endl;
        }
    }   

    TipoItem stack::tam(){ //retorna o tamanho atual da tabela = quais numeros estao nela
    }