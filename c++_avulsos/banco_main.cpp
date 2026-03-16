#include <iostream>
#include "banco.h"

int main(){
    int senha, opcao, saque, deposito;
    std::string login;

    Database dados;
    dados.abrirBanco();
    do{
        std::cout << "Bem Vindo ao Banco! \n";
        std::cout << "[0] Para Sair \n";
        std::cout << "[1] Registrar \n";
        std::cout << "[2] Depositar \n";
        std::cout << "[3] Sacar \n";
        std::cout << "[4] Consultar Saldo \n";
        std::cout << "[5] Mostrar seus Dados \n";
        std:: cout << "Escolha: ";
        std::cin >> opcao;
            if(opcao == 1){
                std::cout << "Para se registrar \n";
                std::cout << "Digite seu Login: ";
                std::cin >> login;
                std::cout << "Digite sua Senha: ";
                std::cin >> senha;
                dados.insertConta(login, senha, 0);
                std::cout << "Conta criada com Sucesso!";
            }else if (opcao == 2){
                    std::cout << "Quantos R$ Voce gostaria de depositar? ";
                    std::cin >> deposito;
                    std::cout << "Seu saldo Total foi atualizado para " << saldo;
                    saldo += deposito;
            }else if(opcao == 3){
                    std::cout << "Quantos R$ Voce gostaria de Sacar? ";
                    std::cin << saque;
        }           saldo -= saque;
    }while (opcao != 0);
    return 0;
};