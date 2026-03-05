#include <iostream>
int main(){
    std::string n;
    float s;
    std::cout << "Qual seu nome: " << std::endl;
    std::getline(std::cin, n);
    std::cout << "E qual seu Salario? ";
    std::cin >> s;
    std::cout << "Nome do Funcionario: " << n << std::endl
    << "Salario: " << s;
    return 0;
}