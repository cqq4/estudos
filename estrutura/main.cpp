#include <iostream>
#include "stack.h"
int main (){
    stack pilha1; //define stack para pilha1
    TipoItem item, opcao; // Tipo item = int setado em stack.h
    
    do{ 
        std::cout << "[0] Stop, [1]Insert 1, [2]Remove Element, [3]Print\n";
        std::cin >> opcao;
        if(opcao == 1){
            std::cout << "Digite oq deseja inserir: ";
            std::cin >> item;
            pilha1.inserir(item); //insere o item
        }else if (opcao == 2){
            item = pilha1.remove();
            std::cout << "Elemento removido";
        }else if (opcao == 3){
            pilha1.print(); 
        }
        
    }while(opcao != 0); //loop comeca em do e termina em while (nao nescessita de {} e sim ;)
    return 0;
};
