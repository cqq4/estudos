#include <iostream>
#include "hash.h"

int main(){
    int tam_vetor, max, opcao, ra;
    bool busca;
    std::string nome;
    std::cout << "Qual o tamanho da Hash?";
    std::cin >> tam_vetor;
    std::cout << "Qual o numero max de elemntos?";
    std::cin >> max;
    std::cout << "O fator de carga e? " << (float)max / (float) tam_vetor;
    Hash alunohash(tam_vetor, max);

    do{
            std::cout << "[0] Parar algoritimo, [1] Inserir, [2]Remover, [3]Buscar, [4] Imprimir";
            std::cin >> opcao;

            if (opcao == 1){
                std::cout << "Qual o RA do aluno ?";
                std::cin >> ra;
                std::cout << "Qual o nome do aluno?";
                std::cin >> nome;
                Aluno aluno(ra, nome);
                alunohash.Inserir(aluno);
            }else if (opcao == 2){
                std::cout << "Qual o Ra do aluno Removido? ";
                std::cin >> ra;
                Aluno aluno(ra, " ");
                alunohash.Remover(aluno);
            }else if (opcao == 3){
                std::cout << "Qual o ra do aluno buscado?";
                std::cin >> ra;
                Aluno aluno (ra, " ");
                alunohash.Buscar(aluno, busca);
                if (busca){
                    std::cout << "Elemento encontrado:";
                    std::cout << "RA: " << aluno.obterRa();
                    std::cout << "Nome: " << aluno.obterNome();
                }else {
                    std::cout << "Aluno nao Encontrado!";
                }
            }else if (opcao == 4){
                alunohash.print();
            }
    } while(opcao != 0);

        return 0;
    };