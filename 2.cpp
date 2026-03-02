#include <iostream>
int main(){
    std::string n;
    std::cout << "Qual seu nome? " << std::endl;
    std::getline(std::cin, n);
    std::cout << "Ola " << n << ", " << "E um prazer te conhecer!";
}