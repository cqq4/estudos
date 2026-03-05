#include <iostream> 
#include <cstring>
#include <sqlite3.h>
void valor(int &val1, int &val2, int &val3, int &val4);
void compra(int &product, int &val1, int &val2, int &val3, int &val4);
int main (){ 
    int product, val1, val2, val3, val4;
    std::string login;
    std::string  senha;
    std::cout << "Ola, Por Favor Insira seu login: ";
    std::cin >> login;
    std::cout << "Insira sua senha: ";
    std::cin >> senha;

    if (login == "admin" && senha == "admin"){
        valor(val1, val2, val3, val4);
    }

    if(login == "user" && senha == "user"){
        compra(product,val1, val2, val3, val4);
    }
};

void valor(int &val1, int &val2, int &val3, int &val4){
    std::cout << "Ola senhor! Vamos Precificar alguns produtos Ok?: ";
    std::cout << "Qual Seria o preco do [1] Pano de Prato: ";
    std::cin >> val1;
    std::cout << "[2] Racao de cachorro: ";
    std::cin >> val2;
    std::cout << "[3] Caneta esferografica: ";
    std::cin >> val3;
    std::cout << "[4] Caneca: ";
    std::cin >> val4;
}

void compra(int &product, int &val1, int &val2, int &val3, int &val4){
    std::cout << "Qual o produto deseja comprar? " << std::endl;
    std::cout << "[1] Pano De Prato " << std::endl << "[2] Racao de cachorro" << std::endl << "[3] Caneta esforografica"  << std::endl << "[4] Caneca";
    std::cin  >> product; 
    if (product == 1){
        std::cout << "O valor do seu produta seria: " << val1 << "Com nosso de 5%, O valor ficaria " << val1 - (val1*5/100);
    }
    if (product == 2){
        std::cout << "O valor do seu produta seria: " << val2 << "Com nosso de 5%, O valor ficaria " << val2 -(val2*5/100);
    }
}
