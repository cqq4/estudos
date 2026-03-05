#include <iostream>
#include <iomanip>
int main(){
    float a,l;
    std::cout << "Qual A Altura da sua parede? ";
    std::cin >> a;
    std::cout << "E a Largura? ";
    std::cin >> l;
    std::cout << std::fixed << std::setprecision(2);
    std::cout << "A area total de sua parede seria " << a*l << std::endl << " Voce usaria um total de" << a*l/2 << " Litros de tinta";
};