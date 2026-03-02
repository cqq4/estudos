#include <iostream>
int main(){
    int n;
    std::cout << "Escolha um numero: ";
    std::cin >> n;
    std::cout << "O antecessor de " << n << " e " << n-1 << std::endl;
    std::cout << "O sucessor de " << n << " e " << n+1;
}